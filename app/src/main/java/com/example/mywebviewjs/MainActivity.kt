package com.example.mywebviewjs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // WebView 定義
        val webView = findViewById<WebView>(R.id.webView)

        // JavaScriptを有効にする
        webView.settings.javaScriptEnabled = true
        // JavaScriptとAndroidをバインドするためのインタフェース
        webView.addJavascriptInterface(WebAppInterface(this),"WebAndroid")
        // ローカルのHTMLファイルを読み込む
        webView.loadUrl("file:///android_asset/index.html")
    }
}