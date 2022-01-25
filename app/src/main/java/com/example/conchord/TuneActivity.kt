package com.example.conchord

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class TuneActivity : AppCompatActivity() {
    lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tune)
        val playHighE = findViewById<Button>(R.id.buttonHighE)
        val playB = findViewById<Button>(R.id.buttonB)
        val playG = findViewById<Button>(R.id.buttonG)
        val playD = findViewById<Button>(R.id.buttonD)
        val playA = findViewById<Button>(R.id.buttonA)
        val playLowE = findViewById<Button>(R.id.buttonBassE)
        val back = findViewById<Button>(R.id.backButton)
        mediaPlayer = MediaPlayer.create(this, R.raw.tuner_bass_e)

        playHighE.setOnClickListener {
            if(mediaPlayer.isPlaying) {
                mediaPlayer.stop()

                mediaPlayer.release()

                mediaPlayer = MediaPlayer.create(this, R.raw.tuner_high_e)
                mediaPlayer.setVolume(1.0f, 1.0f)
                mediaPlayer.start()
                Toast.makeText(this, "Now playing tone: 'High E'", Toast.LENGTH_SHORT).show()
            }
            else{
                mediaPlayer = MediaPlayer.create(this, R.raw.tuner_high_e)
                mediaPlayer.setVolume(1.0f, 1.0f)
                mediaPlayer.start()
                Toast.makeText(this, "Now playing tone: 'High E'", Toast.LENGTH_SHORT).show()
            }
        }
        playB.setOnClickListener {
            if(mediaPlayer.isPlaying) {
                mediaPlayer.stop()
                mediaPlayer.release()
                mediaPlayer = MediaPlayer.create(this, R.raw.tuner_b)
                mediaPlayer.setVolume(1.0f, 1.0f)
                mediaPlayer.start()
                Toast.makeText(this, "Now playing tone: 'B'", Toast.LENGTH_SHORT).show()
            }
            else{
                mediaPlayer = MediaPlayer.create(this, R.raw.tuner_b)
                mediaPlayer.setVolume(1.0f, 1.0f)
                mediaPlayer.start()
                Toast.makeText(this, "Now playing tone: 'B'", Toast.LENGTH_SHORT).show()
            }
        }
        playG.setOnClickListener {
            if(mediaPlayer.isPlaying) {
                mediaPlayer.stop()
                mediaPlayer.release()
                mediaPlayer = MediaPlayer.create(this, R.raw.tuner_g)
                mediaPlayer.setVolume(1.0f, 1.0f)
                mediaPlayer.start()
                Toast.makeText(this, "Now playing tone: 'G'", Toast.LENGTH_SHORT).show()
            }
            else{
                mediaPlayer = MediaPlayer.create(this, R.raw.tuner_g)
                mediaPlayer.setVolume(1.0f, 1.0f)
                mediaPlayer.start()
                Toast.makeText(this, "Now playing tone: 'G'", Toast.LENGTH_SHORT).show()
            }
        }
        playD.setOnClickListener {
            if(mediaPlayer.isPlaying) {
                mediaPlayer.stop()
                mediaPlayer.release()
                mediaPlayer = MediaPlayer.create(this, R.raw.tuner_d)
                mediaPlayer.setVolume(1.0f, 1.0f)
                mediaPlayer.start()
                Toast.makeText(this, "Now playing tone: 'D'", Toast.LENGTH_SHORT).show()
            }
            else{
                mediaPlayer = MediaPlayer.create(this, R.raw.tuner_d)
                mediaPlayer.setVolume(1.0f, 1.0f)
                mediaPlayer.start()
                Toast.makeText(this, "Now playing tone: 'D'", Toast.LENGTH_SHORT).show()
            }
        }
        playA.setOnClickListener {
            if(mediaPlayer.isPlaying) {
                mediaPlayer.stop()
                mediaPlayer.release()
                mediaPlayer = MediaPlayer.create(this, R.raw.tuner_a)
                mediaPlayer.setVolume(1.0f, 1.0f)
                mediaPlayer.start()
                Toast.makeText(this, "Now playing tone: 'A'", Toast.LENGTH_SHORT).show()
            }
            else{
                mediaPlayer = MediaPlayer.create(this, R.raw.tuner_a)
                mediaPlayer.setVolume(1.0f, 1.0f)
                mediaPlayer.start()
                Toast.makeText(this, "Now playing tone: 'A'", Toast.LENGTH_SHORT).show()
            }

        }
        playLowE.setOnClickListener {
            if(mediaPlayer.isPlaying) {
                mediaPlayer.stop()
                mediaPlayer.release()
                mediaPlayer = MediaPlayer.create(this, R.raw.tuner_bass_e)
                mediaPlayer.setVolume(1.0f, 1.0f)
                mediaPlayer.start()
                Toast.makeText(this, "Now playing tone: 'Low E'", Toast.LENGTH_SHORT).show()
            }
            else{
                mediaPlayer = MediaPlayer.create(this, R.raw.tuner_bass_e)
                mediaPlayer.setVolume(1.0f, 1.0f)
                mediaPlayer.start()
                Toast.makeText(this, "Now playing tone: 'Low E'", Toast.LENGTH_SHORT).show()
            }
        }
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}