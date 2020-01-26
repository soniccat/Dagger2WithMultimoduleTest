package com.sample.playwithdagger

import com.sample.core.CoreComponent
import com.sample.core.ScreenSetuper
import com.sample.text.TextModule
import dagger.Component


@AppComp
@Component(dependencies = [CoreComponent::class],
    modules = [AppModule::class, TextModule::class] )
public interface AppComponent {
    fun inject(fragment: FirstFragment)

    fun getScreenSetuper(): ScreenSetuper // by default methods are not inherited from dependencies
}
