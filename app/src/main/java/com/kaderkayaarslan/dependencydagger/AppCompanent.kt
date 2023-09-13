package com.kaderkayaarslan.dependencydagger

import dagger.Component

@Component(modules = [AppModule::class])
interface AppCompanent {
    fun inject(activity:  MainActivity)
}