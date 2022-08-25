package com.example.mywebviewjs

import android.content.Context
import android.webkit.JavascriptInterface
import android.widget.Toast

// AndroidとJSをバインドするインターフェース
class WebAppInterface(private val mContext:Context) {
    // アノテーション
    @JavascriptInterface
    // トースト実行
    fun showToast(toast: String){
        Toast.makeText(mContext,toast,Toast.LENGTH_SHORT).show()
    }
}