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

        //Eine Telefonnummer anwählen
        callBtn.setOnClickListener {
            val telNr = Uri.parse("tel:0177893787899")
            //impliziter Intent Aufruf
            val callIntent = Intent(Intent.ACTION_DIAL, telNr)
            //starting the Intent
            startActivity(callIntent)
        }
        //Eine Webseite aufrufen
        webBtn.setOnClickListener {
            val webUrl = Uri.parse("http://www.zeit.de")
            val webIntent = Intent(Intent.ACTION_VIEW, webUrl)
            startActivity(webIntent)

        }

    }
}
