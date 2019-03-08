package com.harry.dagger2mvpviewmodelhapp.ui.list

import com.harry.dagger2mvpviewmodelhapp.ui.base.BaseContract
import com.harry.dagger2mvpviewmodelhapp.models.DetailsViewModel
import com.harry.dagger2mvpviewmodelhapp.models.Post


class ListContract {

    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun showErrorMessage(error: String)
        fun loadDataSuccess(list: List<Post>)
        fun loadDataAllSuccess(model: DetailsViewModel)
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadData()
        fun loadDataAll()
        fun deleteItem(item: Post)
    }
}