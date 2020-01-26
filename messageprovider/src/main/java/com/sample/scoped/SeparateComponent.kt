package com.sample.scoped

import com.sample.core.CoreComponent
import com.sample.text.TextComp
import com.sample.text.TextModule
import dagger.Component

@SeparateComp
@Component( dependencies = [CoreComponent::class], modules = [SeparateModule::class])
interface SeparateComponent {
    fun getTaskManager(): SeparateTaskManager
}