package com.example.courtcounterapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var scoreTeamA = 0
    var scoreTeamB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addOne(v: View?) {
        scoreTeamA = scoreTeamA + 1
        displayForTeamA(scoreTeamA)
    }

    fun addTwo(v: View?) {
        scoreTeamA = scoreTeamA + 2
        displayForTeamA(scoreTeamA)
    }

    fun addNineteen(v: View?) {
        scoreTeamA = scoreTeamA + 19
        displayForTeamA(scoreTeamA)
    }

    fun addSixteen(v: View?) {
        scoreTeamA = scoreTeamA + 16
        displayForTeamA(scoreTeamA)
    }

    fun addThree(v: View?) {
        scoreTeamA = scoreTeamA + 3
        displayForTeamA(scoreTeamA)
    }

    fun addOneB(v: View?) {
        scoreTeamB = scoreTeamB + 1
        displayForTeamB(scoreTeamB)
    }

    fun addTwoB(v: View?) {
        scoreTeamB = scoreTeamB + 2
        displayForTeamB(scoreTeamB)
    }

    fun addThreeB(v: View?) {
        scoreTeamB = scoreTeamB + 3
        displayForTeamB(scoreTeamB)
    }

    fun addNineteenB(v: View?) {
        scoreTeamB = scoreTeamB + 19
        displayForTeamB(scoreTeamB)
    }

    fun addSixteenB(v: View?) {
        scoreTeamB = scoreTeamB + 16
        displayForTeamB(scoreTeamB)
    }

    fun reset(v: View?) {
        scoreTeamA = 0
        scoreTeamB = 0
        displayForTeamB(scoreTeamA)
        displayForTeamA(scoreTeamB)
    }

    fun displayForTeamB(score: Int) {
        val scoreView = findViewById<TextView>(R.id.team_b_score)
        scoreView.text = score.toString()
    }

    fun displayForTeamA(score: Int) {
        val scoreView = findViewById<TextView>(R.id.team_a_scor)
        scoreView.text = score.toString()
    }
}