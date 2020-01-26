package com.sample.text

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class TextModule {
    @Provides
    fun getTextProvider(context: Context): TextProvider {
        return TextProvider(context)
    }
}