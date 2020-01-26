package com.sample.text

import com.sample.core.CoreComponent
import dagger.Component

@TextComp
@Component( dependencies = [CoreComponent::class], modules = [TextModule::class] )
public interface TextComponent {
    //fun inject(locator: ServiceLocator)
    fun inject(textProvider: TextProvider)

    @Component.Factory
    interface Factory {
        fun create(appComponent: CoreComponent): TextComponent
    }
}