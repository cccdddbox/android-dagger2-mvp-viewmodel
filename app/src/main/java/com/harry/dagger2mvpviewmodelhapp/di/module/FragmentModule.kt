package com.harry.dagger2mvpviewmodelhapp.di.module

import com.harry.dagger2mvpviewmodelhapp.api.ApiServiceInterface
import com.harry.dagger2mvpviewmodelhapp.ui.about.AboutContract
import com.harry.dagger2mvpviewmodelhapp.ui.about.AboutPresenter
import com.harry.dagger2mvpviewmodelhapp.ui.list.ListContract
import com.harry.dagger2mvpviewmodelhapp.ui.list.ListPresenter
import dagger.Module
import dagger.Provides


@Module
class FragmentModule {

    @Provides
    fun provideAboutPresenter(): AboutContract.Presenter {
        return AboutPresenter()
    }

    @Provides
    fun provideListPresenter(): ListContract.Presenter {
        return ListPresenter()
    }

    @Provides
    fun provideApiService(): ApiServiceInterface {
        return ApiServiceInterface.create()
    }
}