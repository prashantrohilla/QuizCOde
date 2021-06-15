package com.mcqquiz.quizcode

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

        binding.score.text=score




    }
}