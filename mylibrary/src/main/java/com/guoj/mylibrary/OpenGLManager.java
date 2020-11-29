package com.guoj.mylibrary;

public class OpenGLManager {
    public static void init(){
        System.loadLibrary("opengl-lib");
    }
    public static native void onSurfaceCreated();
    public static native void onSurfaceChanged(int width,int height);
    public static native void onDrawFrame();
}
