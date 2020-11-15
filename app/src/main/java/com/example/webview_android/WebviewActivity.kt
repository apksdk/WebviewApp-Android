package com.example.webview_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.EditText

class WebviewActivity : AppCompatActivity() {
    private lateinit var webview: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        webview = findViewById<WebView>(R.id.webview);
        val webURL = intent.getStringExtra("webURL")
        webview.loadUrl(webURL.toString())
    }
}