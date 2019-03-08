package com.harry.dagger2mvpviewmodelhapp.ui.main

import com.harry.dagger2mvpviewmodelhapp.ui.base.BaseContract

class MainContract {

    interface View: BaseContract.View {
        fun showAboutFragment()
        fun showListFragment()
    }

    interface Presenter: BaseContract.Presenter<MainContract.View> {
        fun onDrawerOptionAboutClick()
    }
}