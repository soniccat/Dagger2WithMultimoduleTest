package com.sample.core

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView

class CoreView: LinearLayout {
    constructor(context: Context) : super(context, null)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs, 0) {
        applyAttributeSet(attrs)
    }
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        applyAttributeSet(attrs)
    }

    lateinit var textView: TextView

    init {
        textView = TextView(context)
        textView.text = "test text"
        textView.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)

        addView(textView)
    }

    fun setText(str: String) {
        textView.text = str
    }

    private fun applyAttributeSet(attrs: AttributeSet?) {
    }
}