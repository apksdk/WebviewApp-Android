package com.example.webview_android

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.EditText

class WebviewActivity : AppCompatActivity() {
    private lateinit var webview: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        webview = findViewById<WebView>(R.id.webview)
        val webURL = intent.getStringExtra("webURL")
        webview.settings.javaScriptEnabled = true
        webview.settings.domStorageEnabled = true
        webview.webViewClient = WebViewClient()
        webview.loadUrl(webURL.toString())
    }
}