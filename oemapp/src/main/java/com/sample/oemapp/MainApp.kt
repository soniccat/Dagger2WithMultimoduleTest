package com.sample.oemapp

import android.app.Application
import com.sample.core.CoreComponent
import com.sample.core.CoreModule
import com.sample.core.DaggerCoreComponent
import com.sample.core.ServiceLocator

class MainApp: Application() {
    init {
        DaggerCoreComponent.builder()
            .coreModule(CoreModule(this))
            .build()
            .inject(ServiceLocator.instance)
    }
}