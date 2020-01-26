package com.sample.core

import android.content.Context
import dagger.Module
import dagger.Provides


@Module
class CoreModule(private val aContext: Context) {
    @Provides
    fun getContext(): Context {
        return aContext
    }

    @Provides
    fun getViewMaker(): ViewMaker {
        return ViewMaker()
    }

    @Provides
    fun getCoreDB(): CoreDB {
        return CoreDB()
    }
}