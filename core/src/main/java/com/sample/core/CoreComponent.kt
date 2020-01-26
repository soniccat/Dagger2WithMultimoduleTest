package com.sample.core

import android.content.Context
import dagger.Component
import javax.inject.Singleton

@CoreComp
@Component(modules = [CoreModule::class] )
public interface CoreComponent {
    //fun inject(locator: ServiceLocator)

    fun getContext(): Context

    fun getScreenSetuper(): ScreenSetuper

    fun getCoreDB(): CoreDB
}