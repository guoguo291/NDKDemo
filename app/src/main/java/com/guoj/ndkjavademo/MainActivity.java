package com.guoj.ndkjavademo;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.TextView;

import com.guoj.mylibrary.OpenGLManager;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GLSurfaceView openglView=(GLSurfaceView) findViewById(R.id.openglview);
        OpenGLManager.init();
        openglView.setRenderer(new GLSurfaceView.Renderer() {
            @Override
            public void onSurfaceCreated(GL10 gl, EGLConfig config) {
//                gl.glClearColor(1.0f,0.5f,0.0f,1.0f);
                OpenGLManager.onSurfaceCreated();
            }

            @Override
            public void onSurfaceChanged(GL10 gl, int width, int height) {
//                gl.glViewport(200,200,width/2,height/2);
                OpenGLManager.onSurfaceChanged(width,height);
            }

            @Override
            public void onDrawFrame(GL10 gl) {
//                gl.glClear(gl.GL_COLOR_BUFFER_BIT);
                OpenGLManager.onDrawFrame();
            }
        });
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
