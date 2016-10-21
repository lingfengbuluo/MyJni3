package com.test.jni;

/**
 * Created by lingfengbuluo on 2016/10/20.
 */
public class HelloJni {
    public native String getNativeStr();

    public native int setVlanId(int id);

    public native boolean getIsSucess(boolean isSucess);

    static {
        System.loadLibrary("hello");
    }

}