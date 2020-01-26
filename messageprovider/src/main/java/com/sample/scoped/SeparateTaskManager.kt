package com.sample.scoped

import android.content.Context

class SeparateTaskManager(val context: Context) {
    fun doWork(): String {
        return "Yes, Sir!"
    }
}