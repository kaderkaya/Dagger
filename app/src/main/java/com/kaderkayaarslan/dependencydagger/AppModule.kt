package com.kaderkayaarslan.dependencydagger

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideAdres(): Adres {
        return Adres ("Osmangazi/Bursa")
    }
}