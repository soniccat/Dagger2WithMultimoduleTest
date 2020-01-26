package com.sample.text

import android.content.Context
import com.sample.core.CoreComponentOwner
import com.sample.core.CoreDB
import com.sample.core.TextProviderBase
import javax.inject.Inject

class TextProvider(context: Context): TextProviderBase {
    @Inject lateinit var db: CoreDB

    init {
        val coreComponentOwner = context as CoreComponentOwner
        // DaggerTextComponent.builder().coreComponent().build().inject(this) // without TextComponent.Factory
        DaggerTextComponent.factory().create(coreComponentOwner.coreComponent).inject(this)
    }

    override fun calcText(): String {
        return "Text from TextProvider " + db.name()
    }
}