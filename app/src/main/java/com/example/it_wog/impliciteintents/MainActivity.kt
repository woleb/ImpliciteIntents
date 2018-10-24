package com.example.it_wog.impliciteintents

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        callBtn.setOnClickListener {
            val telNr = Uri.parse("tel:0177893787899")
            //impliziter Intent Aufruf
            val callIntent = Intent(Intent.ACTION_DIAL, telNr)
            //starting the Intent
            startActivity(callIntent)
        }

    }
}
