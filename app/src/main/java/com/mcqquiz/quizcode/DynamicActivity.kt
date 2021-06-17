package com.mcqquiz.quizcode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.mcqquiz.quizcode.databinding.ActivityDynamicBinding
import com.mcqquiz.quizcode.models.Questions

class DynamicActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDynamicBinding

    var op1 = false
    var op2 = false
    var op3 = false
    var op4 = false

    private var questionsList: ArrayList<Questions>? = null
    private var selectedOption: Int = 0
    private var position: Int = 0
    private var score: Int = 0
    private var total: Int = 0
    private lateinit var timer: CountDownTimer
    private  var t: Long=21000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDynamicBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()


        Animations()
        position = 1
        list()

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

        binding.leave.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("score",total.toString())
            startActivity(intent)
        }

        binding.submit.setOnClickListener {
            if (op1) selectedOption = 1
            if (op2) selectedOption = 2
            if (op3) selectedOption = 3
            if (op4) selectedOption = 4
            val question = questionsList!![position - 1]

            if (position < 10) {
                if (!op1 && !op2 && !op3 && !op4) {
                    val toast = Toast.makeText(
                        applicationContext,
                        "Select an option !!",
                        Toast.LENGTH_SHORT
                    )
                    toast.show()
                } else {
                    if (question.correctAnswer == selectedOption) {
                        score += 1
                        total+=1
                        val toast =
                            Toast.makeText(applicationContext, "Correct Answer", Toast.LENGTH_SHORT)
                        toast.show()
                    } else {
                        val toast = Toast.makeText(
                            applicationContext,
                            "Incorrect Answer",
                            Toast.LENGTH_SHORT
                        )
                        toast.show()
                    }

                    position += 1
                    timer.cancel()
                    list()
                }
            } else {
                if (question.correctAnswer == selectedOption) {
                    score += 1
                    total+=1
                    val toast =
                        Toast.makeText(applicationContext, "Correct Answer", Toast.LENGTH_SHORT)
                    toast.show()
                } else {
                    val toast =
                        Toast.makeText(applicationContext, "Incorrect Answer", Toast.LENGTH_SHORT)
                    toast.show()
                }

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("score", total.toString())
                startActivity(intent)
            }

        }
    }

    private fun list() {
        var list = intent.getStringExtra("name")

        if (list.equals("c")) {
            if (position == 1) {
                questionsList = C1.getQuestions()
            }
            if (position == 3) {
                if (score == 1) {
                    questionsList = C2.getQuestions()
                }
                if (score == 2) {
                    questionsList = C3.getQuestions()
                }
                score = 0
            }
            if (position == 5) {
                if (score == 0) {
                    questionsList = C1.getQuestions()
                }
                if (score == 1) {
                    questionsList = C2.getQuestions()
                }
                if (score == 2) {
                    questionsList = C3.getQuestions()
                }
                score = 0
            }
            if (position == 7) {
                if (score == 0) {
                    questionsList = C1.getQuestions()
                }
                if (score == 1) {
                    questionsList = C2.getQuestions()
                }
                if (score == 2) {
                    questionsList = C3.getQuestions()
                }
                score = 0
            }
            if (position == 9) {
                if (score == 0) {
                    questionsList = C1.getQuestions()
                }
                if (score == 1) {
                    questionsList = C2.getQuestions()
                }
                if (score == 2) {
                    questionsList = C3.getQuestions()
                }
                score = 0
            }
        }

        if (list.equals("cpp")) {
            if (position == 1) {
                questionsList = Cpp1.getQuestions()
            }
            if (position == 3) {
                if (score == 1) {
                    questionsList = Cpp2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Cpp3.getQuestions()
                }
                score = 0
            }
            if (position == 5) {
                if (score == 0) {
                    questionsList = Cpp1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Cpp2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Cpp3.getQuestions()
                }
                score = 0
            }
            if (position == 7) {
                if (score == 0) {
                    questionsList = Cpp1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Cpp2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Cpp3.getQuestions()
                }
                score = 0
            }
            if (position == 9) {
                if (score == 0) {
                    questionsList = Cpp1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Cpp2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Cpp3.getQuestions()
                }
                score = 0
            }

        }
        if (list.equals("csharp")) {
            if (position == 1) {
                questionsList = Csharp1.getQuestions()
            }
            if (position == 3) {
                if (score == 1) {
                    questionsList = Csharp2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Csharp3.getQuestions()
                }
                score = 0
            }
            if (position == 5) {
                if (score == 0) {
                    questionsList = Csharp1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Csharp2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Csharp3.getQuestions()
                }
                score = 0
            }
            if (position == 7) {
                if (score == 0) {
                    questionsList = Csharp1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Csharp2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Csharp3.getQuestions()
                }
                score = 0
            }
            if (position == 9) {
                if (score == 0) {
                    questionsList = Csharp1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Csharp2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Csharp3.getQuestions()
                }
                score = 0
            }

        }

        if (list.equals("html")) {
            if (position == 1) {
                questionsList = Html1.getQuestions()
            }
            if (position == 3) {
                if (score == 1) {
                    questionsList = Html2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Html3.getQuestions()
                }
                score = 0
            }
            if (position == 5) {
                if (score == 0) {
                    questionsList = Html1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Html2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Html3.getQuestions()
                }
                score = 0
            }
            if (position == 7) {
                if (score == 0) {
                    questionsList = Html1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Html2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Html3.getQuestions()
                }
                score = 0
            }
            if (position == 9) {
                if (score == 0) {
                    questionsList = Html1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Html2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Html3.getQuestions()
                }
                score = 0
            }
        }

        if (list.equals("java"))                                   /////////////    // 5
        {
            if (position == 1) {
                questionsList = Java1.getQuestions()
            }
            if (position == 3) {
                if (score == 1) {
                    questionsList = Java2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Java3.getQuestions()
                }
                score = 0
            }
            if (position == 5) {
                if (score == 0) {
                    questionsList = Java1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Java2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Java3.getQuestions()
                }
                score = 0
            }
            if (position == 7) {
                if (score == 0) {
                    questionsList = Java1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Java2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Java3.getQuestions()
                }
                score = 0
            }
            if (position == 9) {
                if (score == 0) {
                    questionsList = Java1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Java2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Java3.getQuestions()
                }
                score = 0
            }

        }

        if (list.equals("javascript")) {
            if (position == 1) {
                questionsList = Javascript1.getQuestions()
            }
            if (position == 3) {
                if (score == 1) {
                    questionsList = Javascript2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Javascript3.getQuestions()
                }
                score = 0
            }
            if (position == 5) {
                if (score == 0) {
                    questionsList = Javascript1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Javascript2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Javascript3.getQuestions()
                }
                score = 0
            }
            if (position == 7) {
                if (score == 0) {
                    questionsList = Javascript1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Javascript2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Javascript3.getQuestions()
                }
                score = 0
            }
            if (position == 9) {
                if (score == 0) {
                    questionsList = Javascript1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Javascript2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Javascript3.getQuestions()
                }
                score = 0
            }

        }

        if (list.equals("mongodb")) {
            if (position == 1) {
                questionsList = Mongodb1.getQuestions()
            }
            if (position == 3) {
                if (score == 1) {
                    questionsList = Mongodb2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Mongodb3.getQuestions()
                }
                score = 0
            }
            if (position == 5) {
                if (score == 0) {
                    questionsList = Mongodb1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Mongodb2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Mongodb3.getQuestions()
                }
                score = 0
            }
            if (position == 7) {
                if (score == 0) {
                    questionsList = Mongodb1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Mongodb2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Mongodb3.getQuestions()
                }
                score = 0
            }
            if (position == 9) {
                if (score == 0) {
                    questionsList = Mongodb1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Mongodb2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Mongodb3.getQuestions()
                }
                score = 0
            }

        }

        if (list.equals("mysql")) {
            if (position == 1) {
                questionsList = Mysql1.getQuestions()
            }
            if (position == 3) {
                if (score == 1) {
                    questionsList = Mysql2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Mysql3.getQuestions()
                }
                score = 0
            }
            if (position == 5) {
                if (score == 0) {
                    questionsList = Mysql1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Mysql2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Mysql3.getQuestions()
                }
                score = 0
            }
            if (position == 7) {
                if (score == 0) {
                    questionsList = Mysql1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Mysql2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Mysql3.getQuestions()
                }
                score = 0
            }
            if (position == 9) {
                if (score == 0) {
                    questionsList = Mysql1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Mysql2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Mysql3.getQuestions()
                }
                score = 0
            }

        }

        if (list.equals("php")) {
            if (position == 1) {
                questionsList = Php1.getQuestions()
            }
            if (position == 3) {
                if (score == 1) {
                    questionsList = Php2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Php3.getQuestions()
                }
                score = 0
            }
            if (position == 5) {
                if (score == 0) {
                    questionsList = Php1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Php2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Php3.getQuestions()
                }
                score = 0
            }
            if (position == 7) {
                if (score == 0) {
                    questionsList = Php1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Php2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Php3.getQuestions()
                }
                score = 0
            }
            if (position == 9) {
                if (score == 0) {
                    questionsList = Php1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Php2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Php3.getQuestions()
                }
                score = 0
            }

        }

        if (list.equals("python")) {
            if (position == 1) {
                questionsList = Python1.getQuestions()
            }
            if (position == 3) {
                if (score == 1) {
                    questionsList = Python2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Python3.getQuestions()
                }
                score = 0
            }
            if (position == 5) {
                if (score == 0) {
                    questionsList = Python1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Python2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Python3.getQuestions()
                }
                score = 0
            }
            if (position == 7) {
                if (score == 0) {
                    questionsList = Python1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Python2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Python3.getQuestions()
                }
                score = 0
            }
            if (position == 9) {
                if (score == 0) {
                    questionsList = Python1.getQuestions()
                }
                if (score == 1) {
                    questionsList = Python2.getQuestions()
                }
                if (score == 2) {
                    questionsList = Python3.getQuestions()
                }
                score = 0
            }

        }

        setQuestion()
    }

    private fun setQuestion() {
        val question = questionsList!![position - 1]

        binding.questionNumber.text = question.id.toString()
        binding.question.text = question!!.question
        binding.option1.text = question.optionOne
        binding.option2.text = question.optionTwo
        binding.option3.text = question.optionThree
        binding.option4.text = question.optionFour
        binding.progressbar.progress = question.id * 10

        op1 = false
        op2 = false
        op3 = false
        op4 = false
        binding.option1.setBackgroundResource(R.drawable.squarestroke)
        binding.option2.setBackgroundResource(R.drawable.squarestroke)
        binding.option3.setBackgroundResource(R.drawable.squarestroke)
        binding.option4.setBackgroundResource(R.drawable.squarestroke)

        t=16000

        timer = object : CountDownTimer(t, 1000) {
            override fun onFinish() {
                position += 1
                list()

                if (position == 10) {
                    next()
                }
            }
            override fun onTick(p: Long) {
                binding.secondsRemaining.text = (p/1000).toString()
            }
        }.start()



    }


    private fun Animations() {
        val r = (1..10).random()

        if (r == 1) binding.layoutbackground.setBackgroundResource(R.drawable.one)
        if (r == 2) binding.layoutbackground.setBackgroundResource(R.drawable.two)
        if (r == 3) binding.layoutbackground.setBackgroundResource(R.drawable.three)
        if (r == 4) binding.layoutbackground.setBackgroundResource(R.drawable.four)
        if (r == 5) binding.layoutbackground.setBackgroundResource(R.drawable.five)

        if (r == 6) binding.layoutbackground.setBackgroundResource(R.drawable.six)
        if (r == 7) binding.layoutbackground.setBackgroundResource(R.drawable.seven)
        if (r == 8) binding.layoutbackground.setBackgroundResource(R.drawable.eight)
        if (r == 9) binding.layoutbackground.setBackgroundResource(R.drawable.nine)
        if (r == 10) binding.layoutbackground.setBackgroundResource(R.drawable.ten)


        val scale = AnimationUtils.loadAnimation(this, R.anim.scale)
        val translate = AnimationUtils.loadAnimation(this, R.anim.translate)
        val ntranslate = AnimationUtils.loadAnimation(this, R.anim.ntranslate)

        binding.questionNumber.startAnimation(scale)
        binding.option1.startAnimation(translate)
        binding.option2.startAnimation(ntranslate)
        binding.option3.startAnimation(translate)
        binding.option4.startAnimation(ntranslate)
    }

    private fun next() {
        timer.cancel()
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("score",total.toString())
        startActivity(intent)
    }

}