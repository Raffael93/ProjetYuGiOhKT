package com.example.yugikt.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yugikt.R
import kotlinx.android.synthetic.main.activity_p_d_f.*

class PDFActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p_d_f)


        pdfviewer.fromAsset("rule.pdf").load()



    }
}