package com.mcqquiz.quizcode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.mcqquiz.quizcode.databinding.ActivityLevelBinding
import com.mcqquiz.quizcode.databinding.ActivityQuestionsBinding
import com.mcqquiz.quizcode.databinding.ActivitySelectQuizBinding

class Level : AppCompatActivity() {
    private lateinit var binding: ActivityLevelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLevelBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        var name=intent.getStringExtra("name")

        var list:String=""

        Animations()

        binding.easy.setOnClickListener{

            if(name.equals("c"))  list="c1"
            if(name.equals("cpp")) list="cpp1"
            if(name.equals("java")) list="java1"
            if(name.equals("python")) list="python1"
            if(name.equals("html")) list="html1"

            if(name.equals("javascript")) list="javascript1"
            if(name.equals("csharp")) list= "csharp1"
            if(name.equals("kotlin")) list="kotlin1"
            if(name.equals("mysql")) list="mysql1"
            if(name.equals("firebase")) list="firebase1"

            val intent = Intent(this,QuestionsActivity::class.java)
            intent.putExtra("list",list)
            startActivity(intent)
        }


        binding.medium.setOnClickListener{

            if(name.equals("c"))  list="c2"
            if(name.equals("cpp")) list="cpp2"
            if(name.equals("java")) list="java2"
            if(name.equals("python")) list="python2"
            if(name.equals("html")) list="html2"

            if(name.equals("javascript")) list="javascript2"
            if(name.equals("csharp")) list= "csharp2"
            if(name.equals("kotlin")) list="kotlin2"
            if(name.equals("mysql")) list="mysql2"
            if(name.equals("firebase")) list="firebase2"

            val intent = Intent(this,QuestionsActivity::class.java)
            intent.putExtra("list",list)
            startActivity(intent)
        }

        binding.hard.setOnClickListener{

            if(name.equals("c"))  list="c3"
            if(name.equals("cpp")) list="cpp3"
            if(name.equals("java")) list="java3"
            if(name.equals("python")) list="python3"
            if(name.equals("html")) list="html2"

            if(name.equals("javascript")) list="javascript3"
            if(name.equals("csharp")) list= "csharp3"
            if(name.equals("kotlin")) list="kotlin3"
            if(name.equals("mysql")) list="mysql3"
            if(name.equals("firebase")) list="firebase3"

            val intent = Intent(this,QuestionsActivity::class.java)
            intent.putExtra("list",list)
            startActivity(intent)
        }

    }

    private fun Animations()
    {
        val translate= AnimationUtils.loadAnimation(this,R.anim.translate)
        val ntranslate= AnimationUtils.loadAnimation(this,R.anim.ntranslate)

        binding.easy.startAnimation(translate)
        binding.medium.startAnimation(ntranslate)
        binding.hard.startAnimation(translate)
    }
}











