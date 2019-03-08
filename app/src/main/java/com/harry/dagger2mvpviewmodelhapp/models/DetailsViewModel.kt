package com.harry.dagger2mvpviewmodelhapp.models

import com.google.gson.Gson
import com.harry.dagger2mvpviewmodelhapp.models.Post
import com.harry.dagger2mvpviewmodelhapp.models.User

data class DetailsViewModel(val posts: List<Post>, val users: List<User>, val albums: List<Album>) {
    fun toJson(): String {
        return Gson().toJson(this)
    }
}