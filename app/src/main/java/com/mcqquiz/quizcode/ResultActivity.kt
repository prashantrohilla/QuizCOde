package com.mcqquiz.quizcode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mcqquiz.quizcode.databinding.ActivityQuestionsBinding
import com.mcqquiz.quizcode.databinding.ActivityResult2Binding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResult2Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityResult2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        var score=intent.getStringExtra("score")

        var s=Integer.parseInt(score)
        var correct=s
        var incorrect=10-s
        s *= 10

        binding.score.text=s.toString()
        binding.correct.text=correct.toString()
        binding.incorrect.text=incorrect.toString()

        binding.playAgain.setOnClickListener{
            val intent = Intent(this,SelectQuiz::class.java)
            startActivity(intent)
        }





    }
}