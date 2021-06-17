package com.mcqquiz.quizcode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.airbnb.lottie.LottieAnimationView
import com.mcqquiz.quizcode.R.id.android
import com.mcqquiz.quizcode.R.id.startButton
import com.mcqquiz.quizcode.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val scale=AnimationUtils.loadAnimation(this,R.anim.scale)
        val translate=AnimationUtils.loadAnimation(this,R.anim.translate)

        binding.android.startAnimation(scale)
        binding.startButton.startAnimation(translate)

        binding.startButton.setOnClickListener{
            val intent = Intent(this,SelectQuiz::class.java)
            startActivity(intent)
        }

    }
}