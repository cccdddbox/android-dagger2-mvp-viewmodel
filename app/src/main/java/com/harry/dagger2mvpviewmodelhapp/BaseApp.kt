package com.harry.dagger2mvpviewmodelhapp

import android.app.Application
import com.harry.dagger2mvpviewmodelhapp.di.component.ApplicationComponent
import com.harry.dagger2mvpviewmodelhapp.di.component.DaggerApplicationComponent
import com.harry.dagger2mvpviewmodelhapp.di.module.ApplicationModule

/**
 * Created by ogulcan on 07/02/2018.
 */
class BaseApp: Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        instance = this
        setup()

        if (BuildConfig.DEBUG) {
            // Maybe TimberPlant etc.
        }
    }

    fun setup() {
        component = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this)).build()
        component.inject(this)
    }

    fun getApplicationComponent(): ApplicationComponent {
        return component
    }

    companion object {
        lateinit var instance: BaseApp private set
    }
}