package com.example.yugikt.View

import android.content.Intent
import android.media.MediaPlayer.OnCompletionListener
import android.net.Uri
import android.os.Bundle
import android.view.WindowManager
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.example.yugikt.ModelView.MainActivity
import com.example.yugikt.R


class VideoView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_view)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        supportActionBar!!.hide()

       val videoView = findViewById<VideoView>(R.id.videoView)

        val video =
            Uri.parse("android.resource://" + packageName + "/" + R.raw.video)
        videoView.setVideoURI(video)

        videoView.setOnCompletionListener(OnCompletionListener {
            if (isFinishing) return@OnCompletionListener
            startActivity(Intent(this@VideoView, MainActivity::class.java))
            finish()
        })
        videoView.start()
    }
}