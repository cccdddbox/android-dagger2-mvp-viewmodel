package com.harry.dagger2mvpviewmodelhapp.di.component

import com.harry.dagger2mvpviewmodelhapp.di.module.ActivityModule
import com.harry.dagger2mvpviewmodelhapp.ui.main.MainActivity
import dagger.Component


@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

}