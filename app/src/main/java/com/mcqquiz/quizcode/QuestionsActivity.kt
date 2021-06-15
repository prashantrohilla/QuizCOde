package com.mcqquiz.quizcode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.mcqquiz.quizcode.databinding.ActivityQuestionsBinding
import com.mcqquiz.quizcode.models.Questions

class QuestionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuestionsBinding

    var op1 = false
    var op2 = false
    var op3 = false
    var op4 = false

    private var questionsList: ArrayList<Questions>? = null
    private var selectedOption: Int = 0
    private var position: Int = 0
    private var score: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        Animations()
        var list=intent.getStringExtra("list")

        position = 1
        questionsList = c1.getQuestions()
        setQuestion()

        binding.option1.setOnClickListener {
            if (op1) {
                binding.option1.setBackgroundResource(R.drawable.squarestroke)
                op1 = false
            } else {
                op1 = true
                binding.option1.setBackgroundResource(R.drawable.purplestroke)
                op2 = false
                binding.option2.setBackgroundResource(R.drawable.squarestroke)
                op3 = false
                binding.option3.setBackgroundResource(R.drawable.squarestroke)
                op4 = false
                binding.option4.setBackgroundResource(R.drawable.squarestroke)
            }
        }

        binding.option2.setOnClickListener {
            if (op2) {
                binding.option2.setBackgroundResource(R.drawable.squarestroke)
                op2 = false
            } else {
                op2 = true
                binding.option2.setBackgroundResource(R.drawable.purplestroke)
                op1 = false
                binding.option1.setBackgroundResource(R.drawable.squarestroke)
                op3 = false
                binding.option3.setBackgroundResource(R.drawable.squarestroke)
                op4 = false
                binding.option4.setBackgroundResource(R.drawable.squarestroke)
            }
        }

        binding.option3.setOnClickListener {
            if (op3) {
                binding.option3.setBackgroundResource(R.drawable.squarestroke)
                op3 = false
            } else {
                op3 = true
                binding.option3.setBackgroundResource(R.drawable.purplestroke)
                op2 = false
                binding.option2.setBackgroundResource(R.drawable.squarestroke)
                op1 = false
                binding.option1.setBackgroundResource(R.drawable.squarestroke)
                op4 = false
                binding.option4.setBackgroundResource(R.drawable.squarestroke)
            }
        }

        binding.option4.setOnClickListener {
            if (op4) {
                binding.option4.setBackgroundResource(R.drawable.squarestroke)
                op4 = false
            } else {
                op4 = true
                binding.option4.setBackgroundResource(R.drawable.purplestroke)
                op2 = false
                binding.option2.setBackgroundResource(R.drawable.squarestroke)
                op3 = false
                binding.option3.setBackgroundResource(R.drawable.squarestroke)
                op1 = false
                binding.option1.setBackgroundResource(R.drawable.squarestroke)
            }
        }

        binding.submit.setOnClickListener {
            if(op1) selectedOption=1
            if(op2) selectedOption=2
            if(op3) selectedOption=3
            if(op4) selectedOption=4
            val question = questionsList!![position - 1]

            if(position<10)
            {
                if(!op1 && !op2 && !op3 && !op4)
                {
                    val toast = Toast.makeText(applicationContext, "Select an option !!", Toast.LENGTH_SHORT)
                    toast.show()
                }
                else
                {

                    if(question.correctAnswer==selectedOption)
                    {
                        score+=1
                        val toast = Toast.makeText(applicationContext, "Correct Answer", Toast.LENGTH_SHORT)
                        toast.show()
                    }
                    else
                    {
                        val toast = Toast.makeText(applicationContext, "Incorrect Answer", Toast.LENGTH_SHORT)
                        toast.show()
                    }

                    position += 1
                    setQuestion()
                }
            }
            else
            {
                if(question.correctAnswer==selectedOption)
                {
                    score+=1
                    val toast = Toast.makeText(applicationContext, "Correct Answer", Toast.LENGTH_SHORT)
                    toast.show()
                }
                else
                {
                    val toast = Toast.makeText(applicationContext, "Incorrect Answer", Toast.LENGTH_SHORT)
                    toast.show()
                }

                val intent = Intent(this,ResultActivity::class.java)
                //intent.putExtra("list",list)
                intent.putExtra("score",score)
                startActivity(intent)
            }

        }
    }

    private fun setQuestion() {
        val question = questionsList!![position - 1]

        binding.questionNumber.text = question.id.toString()
        binding.question.text = question!!.question
        binding.option1.text = question.optionOne
        binding.option2.text = question.optionTwo
        binding.option3.text = question.optionThree
        binding.option4.text = question.optionFour

        op1=false
        op2=false
        op3=false
        op4=false
        binding.option1.setBackgroundResource(R.drawable.squarestroke)
        binding.option2.setBackgroundResource(R.drawable.squarestroke)
        binding.option3.setBackgroundResource(R.drawable.squarestroke)
        binding.option4.setBackgroundResource(R.drawable.squarestroke)

    }


    private fun Animations() {
        val r = (1..10).random()

        if(r==1) binding.layoutbackground.setBackgroundResource(R.drawable.one)
        if(r==2) binding.layoutbackground.setBackgroundResource(R.drawable.two)
        if(r==3) binding.layoutbackground.setBackgroundResource(R.drawable.three)
        if(r==4) binding.layoutbackground.setBackgroundResource(R.drawable.four)
        if(r==5) binding.layoutbackground.setBackgroundResource(R.drawable.five)

        if(r==6) binding.layoutbackground.setBackgroundResource(R.drawable.six)
        if(r==7) binding.layoutbackground.setBackgroundResource(R.drawable.seven)
        if(r==8) binding.layoutbackground.setBackgroundResource(R.drawable.eight)
        if(r==9) binding.layoutbackground.setBackgroundResource(R.drawable.nine)
        if(r==10) binding.layoutbackground.setBackgroundResource(R.drawable.ten)


        val scale = AnimationUtils.loadAnimation(this, R.anim.scale)
        val translate = AnimationUtils.loadAnimation(this, R.anim.translate)
        val ntranslate = AnimationUtils.loadAnimation(this, R.anim.ntranslate)

        binding.questionNumber.startAnimation(scale)
        binding.option1.startAnimation(translate)
        binding.option2.startAnimation(ntranslate)
        binding.option3.startAnimation(translate)
        binding.option4.startAnimation(ntranslate)
    }
}