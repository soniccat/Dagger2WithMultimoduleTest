package com.sample.playwithdagger

import android.app.Application
import com.sample.core.CoreComponent
import com.sample.core.CoreComponentOwner
import com.sample.core.CoreModule
import com.sample.core.DaggerCoreComponent
import com.sample.text.TextModule

//import com.sample.core.ServiceLocator

class MainApp: Application(), CoreComponentOwner {
    companion object {
        lateinit var instance: MainApp
    }

    var component: AppComponent
    override val coreComponent: CoreComponent

    init {
        instance = this

        coreComponent = DaggerCoreComponent.builder().coreModule(CoreModule(this)).build()
        //val textComponent = DaggerTextComponent.builder().coreComponent(coreComponent).build()
        component = DaggerAppComponent.builder()
            .coreComponent(coreComponent)
            //.core(CoreModule(this))
            .textModule(TextModule())
            .appModule(AppModule())
            //.coreComponent(coreComponent)
            //.textComponent(textComponent)
            .build()
    }
}