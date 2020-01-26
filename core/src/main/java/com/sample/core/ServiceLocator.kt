package com.sample.core

import javax.inject.Inject

//class ServiceLocator {
//    companion object {
//        var instance = ServiceLocator()
//    }
//
//    @Inject
//    lateinit var viewMaker: ViewMaker
//
////    @Inject
////    lateinit var textProvider: TextProviderBase
//}
//
interface TextProviderBase {
    fun calcText(): String
}