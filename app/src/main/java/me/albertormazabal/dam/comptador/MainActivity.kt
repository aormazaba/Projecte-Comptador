package me.albertormazabal.dam.comptador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    internal lateinit var tapMeButton: Button
    internal lateinit var timeTextView: TextView
    internal lateinit var counterTextView: TextView
    internal var counter = 0
    internal var time = 60

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tapMeButton = findViewById(R.id.tapMeButton)
        timeTextView = findViewById(R.id.timeTextView)
        counterTextView = findViewById(R.id.counterTextView)

        //TODO haurem d'executar incrementCounter
        // Actualitzarem valor inicial del counterTextView

        tapMeButton.setOnClickListener{
            incrementCounter()

        }

       timeTextView.text = getString(R.string.timeText, time)
    }

    private fun incrementCounter() {
        counter += 1
        counterTextView.text = counter.toString()


    }
}