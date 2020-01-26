package com.sample.core

import android.content.Context
import android.view.View
import android.view.ViewGroup

class ViewMaker {
    fun make(context: Context): CoreView {
        return CoreView(context)
    }
}