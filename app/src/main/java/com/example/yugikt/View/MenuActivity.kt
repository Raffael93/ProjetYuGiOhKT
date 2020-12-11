package com.example.yugikt.View

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.yugikt.R
import com.example.yugikt.ModelView.RecyclerView
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        buttonCards.setOnClickListener {
            startActivity(Intent(this, RecyclerView::class.java))
        }

        buttonRules.setOnClickListener {
            startActivity(Intent(this, PDFActivity::class.java))
        }

        buttonSearch.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))

        }


    }
}