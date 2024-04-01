package com.example.tugasmc4

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugasmc4.databinding.ActivityHomeBinding
import com.example.tugasmc4.databinding.ActivityMainBinding

class Home : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
//        val browser:Button = findViewById(R.id.btnbrowser)
        val browser:Button = findViewById(R.id.btnbrowser)

        browser.setOnClickListener {

            browser.setOnClickListener{
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com"));
                startActivity(intent)
            }
        }
    }
}