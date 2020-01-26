package com.sample.core

import android.view.ViewGroup
import javax.inject.Inject

class ScreenSetuper @Inject constructor(val viewMaker: ViewMaker) {
    fun setup(viewGroup: ViewGroup, str: String) {
        viewGroup.addView(viewMaker.make(viewGroup.context).apply {
            setText(str)
        })
    }
}