package com.example.helloworldsdk

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.TextView

class HelloWorld @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {

    private val textView: TextView

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.view_hello_world, this, true)
        textView = view.findViewById(R.id.tvHelloWorld)
    }

    fun setMessage(message: String) {
        textView.text = message
    }
}