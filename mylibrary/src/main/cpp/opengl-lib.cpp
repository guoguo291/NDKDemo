//
// Created by guoj on 2020/11/29.
//
#include <jni.h>
#include <string>
#include <GLES2/gl2.h>
#include <GLES2/gl2ext.h>
#define OPENGLFUN(arg) Java_com_guoj_mylibrary_OpenGLManager_##arg
extern "C" JNIEXPORT void JNICALL OPENGLFUN(onSurfaceCreated)(
        JNIEnv* env,
        jclass clazz) {
    glClearColor(0.0f,1.0f,0.0f,0.8f);
}
extern "C" JNIEXPORT void JNICALL OPENGLFUN(onSurfaceChanged)(
        JNIEnv* env,
        jclass clazz,
        jint width,
        jint height) {
    glViewport(200,200,width/2,height/2);

}
extern "C" JNIEXPORT void JNICALL OPENGLFUN(onDrawFrame)(
        JNIEnv* env,
        jclass clazz) {
    glClear(GL_COLOR_BUFFER_BIT);
}
