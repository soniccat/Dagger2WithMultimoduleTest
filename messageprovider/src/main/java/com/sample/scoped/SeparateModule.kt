package com.sample.scoped

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class SeparateModule {
    @SeparateComp
    @Provides
    fun getTaskManager(context: Context): SeparateTaskManager {
        return SeparateTaskManager(context)
    }
}