package com.mcqquiz.quizcode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.airbnb.lottie.LottieAnimationView
import com.mcqquiz.quizcode.R.id.android
import com.mcqquiz.quizcode.R.id.startButton
import com.mcqquiz.quizcode.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val scale=AnimationUtils.loadAnimation(this,R.anim.scale)
        val translate=AnimationUtils.loadAnimation(this,R.anim.translate)

        val android=findViewById<LottieAnimationView>(android)
        val startButton=findViewById<LottieAnimationView>(startButton)

        android.startAnimation(scale)
        startButton.startAnimation(translate)

        startButton.setOnClickListener{
            val intent = Intent(this,SelectQuiz::class.java)
            startActivity(intent)
        }

    }
}