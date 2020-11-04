package com.example.yugikt

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        buttonCards.setOnClickListener {
            startActivity(Intent(this,RecyclerView::class.java))
        }

        buttonRules.setOnClickListener {
            startActivity(Intent(this,PDFActivity::class.java))
        }

        buttonSearch.setOnClickListener {
            startActivity(Intent(this,SearchActivity::class.java))

        }


    }
}