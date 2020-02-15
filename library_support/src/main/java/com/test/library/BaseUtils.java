package com.test.library;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;

public class BaseUtils {
    private static BaseUtils baseUtils=new BaseUtils();

    private BaseUtils(){

    }
    public static BaseUtils getTest(){
        return baseUtils;
    }

    // 请求权限
    public static void requestPermission(Activity activity,String[] permission,int code){
        ActivityCompat.requestPermissions(activity,permission,code);
    }

    // 检查权限
    public static boolean checkSelfPermission(Context context,String permission){
        int result=ActivityCompat.checkSelfPermission(context,permission);
        if(result == PackageManager.PERMISSION_GRANTED){
            return true;
        }
        return false;
    }

    //shouldShowRequestPermissionRationale是Google提供的是否要显示提示界面的方法。
    //如果用户曾经拒绝过权限，或者在设置界面里关掉过权限，那么会返回true
    //如果用户从来没有拒绝过权限，或者点了'不再提示'并拒绝，又或者系统本身不允许这种权限的出现。则会返回false
    public static boolean shouldShowRequestPermissionRationale(Activity activity,String permission){
        return  ActivityCompat.shouldShowRequestPermissionRationale(activity,permission);
    }

    @SuppressLint("MissingPermission")
    public static String getIMEI(Context context) {
        String imei = "";
        if (checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE)) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            if (telephonyManager != null) {
                imei = telephonyManager.getDeviceId();
                if (TextUtils.isEmpty(imei) || "0".equals(imei) || "000000000000000".equals(imei)) {
                    imei = "";
                }
            }
        } else {
            Log.e("Demo","Android Support ：没READ_PHONE_STATE权限,无法读取IMEI");
        }

        return imei;
    }
}
