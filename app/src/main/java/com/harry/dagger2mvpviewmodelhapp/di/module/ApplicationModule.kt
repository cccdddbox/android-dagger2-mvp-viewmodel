package com.harry.dagger2mvpviewmodelhapp.di.module

import android.app.Application
import com.harry.dagger2mvpviewmodelhapp.BaseApp
import com.harry.dagger2mvpviewmodelhapp.di.scope.PerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ApplicationModule(private val baseApp: BaseApp) {

    @Provides
    @Singleton
    @PerApplication
    fun provideApplication(): Application {
        return baseApp
    }
}