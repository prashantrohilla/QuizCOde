package com.mcqquiz.quizcode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import android.widget.Toast
import com.airbnb.lottie.LottieAnimationView
import com.mcqquiz.quizcode.databinding.ActivitySelectQuizBinding

class SelectQuiz : AppCompatActivity() {

    private lateinit var binding: ActivitySelectQuizBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val scale=AnimationUtils.loadAnimation(this,R.anim.scale)

        binding.c.startAnimation(scale)
        binding.cpp.startAnimation(scale)
        binding.java.startAnimation(scale)
        binding.python.startAnimation(scale)
        binding.html.startAnimation(scale)

        binding.javascript.startAnimation(scale)
        binding.csharp.startAnimation(scale)
        binding.php.startAnimation(scale)
        binding.mysql.startAnimation(scale)
        binding.mongodb.startAnimation(scale)

        binding.c.setOnClickListener{
            val intent = Intent(this,Level::class.java)
            intent.putExtra("name","c")
            startActivity(intent)
        }

        binding.cpp.setOnClickListener{
            val intent = Intent(this,Level::class.java)
            intent.putExtra("name","cpp")
            startActivity(intent)
        }

        binding.java.setOnClickListener{
            val intent = Intent(this,Level::class.java)
            intent.putExtra("name","java")
            startActivity(intent)
        }

        binding.python.setOnClickListener{
            val intent = Intent(this,Level::class.java)
            intent.putExtra("name","python")
            startActivity(intent)
        }

        binding.html.setOnClickListener{
            val intent = Intent(this,Level::class.java)
            intent.putExtra("name","html")
            startActivity(intent)
        }

        binding.javascript.setOnClickListener{
            val intent = Intent(this,Level::class.java)
            intent.putExtra("name","javascript")
            startActivity(intent)
        }

        binding.csharp.setOnClickListener{
            val intent = Intent(this,Level::class.java)
            intent.putExtra("name","csharp")
            startActivity(intent)
        }

        binding.php.setOnClickListener{
            val intent = Intent(this,Level::class.java)
            intent.putExtra("name","php")
            startActivity(intent)
        }

        binding.mysql.setOnClickListener{
            val intent = Intent(this,Level::class.java)
            intent.putExtra("name","mysql")
            startActivity(intent)
        }

        binding.mongodb.setOnClickListener{
            val intent = Intent(this,Level::class.java)
            intent.putExtra("name","mongodb")
            startActivity(intent)
        }

    }
}