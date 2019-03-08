package com.harry.dagger2mvpviewmodelhapp.di.component

import com.harry.dagger2mvpviewmodelhapp.BaseApp
import com.harry.dagger2mvpviewmodelhapp.di.module.ApplicationModule
import dagger.Component


@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(application: BaseApp)

}