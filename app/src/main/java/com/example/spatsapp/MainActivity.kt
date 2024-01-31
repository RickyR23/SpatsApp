package com.example.spatsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.spatsapp.loginSession.loginSession

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(1500);
        installSplashScreen();
        setContentView(R.layout.activity_main)
        val numTest = 0;
        if(numTest != 1){ //TODO: check if userAccount column loginStatus if(record = 1){openMainScreen()} else{openLoginPage()}
            openLoginPage()
        }



    }

    fun openLoginPage(){
        val intent = Intent(this, loginSession::class.java)
        startActivity(intent)
    }

}