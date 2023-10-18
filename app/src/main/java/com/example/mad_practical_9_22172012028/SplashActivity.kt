package com.example.mad_practical_9_22172012028

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity() ,AnimationListener{
    lateinit var logoanimation: AnimationDrawable
    lateinit var tweenanimation:Animation
    var logoimg:ImageView= findViewById((R.id.logo)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        logoimg.setBackgroundResource(R.drawable.logoanimation)
        logoanimation = logoimg.background as AnimationDrawable

        tweenanimation = AnimationUtils.loadAnimation(this,R.anim.tween_animation)
        tweenanimation.setAnimationListener(this)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if(hasFocus)
        {
            logoanimation.start()
        }
        else
        {
            logoanimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }
}