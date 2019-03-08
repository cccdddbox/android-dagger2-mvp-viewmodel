package com.harry.dagger2mvpviewmodelhapp.di.component

import com.harry.dagger2mvpviewmodelhapp.di.module.FragmentModule
import com.harry.dagger2mvpviewmodelhapp.ui.about.AboutFragment
import com.harry.dagger2mvpviewmodelhapp.ui.list.ListFragment
import dagger.Component


@Component(modules = arrayOf(FragmentModule::class))
interface FragmentComponent {

    fun inject(aboutFragment: AboutFragment)

    fun inject(listFragment: ListFragment)

}