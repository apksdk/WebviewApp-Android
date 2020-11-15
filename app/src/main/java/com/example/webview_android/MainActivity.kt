package com.example.webview_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    private lateinit var uriET: EditText
    private lateinit var httpProtocolSW: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        uriET = findViewById<EditText>(R.id.uriET)
        httpProtocolSW = findViewById<Switch>(R.id.httpProtocolSW)
    }

    fun openWebviewClickHandler(view: View) {
        val et = findViewById<EditText>(R.id.uriET)
        val message = et.text.toString();
        val intent = Intent(view.context, WebviewActivity::class.java).apply {
            putExtra("webURL", buildURL(message))
        }
        startActivity(intent)
    }

    private fun buildURL(urlString: String): String {
        val httpProtocol = if(httpProtocolSW.isChecked) "https" else "http"
        return if(urlString.startsWith("http")) urlString else "${httpProtocol}://${urlString}"
    }
}