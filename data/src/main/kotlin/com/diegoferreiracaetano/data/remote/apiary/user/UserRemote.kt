package com.diegoferreiracaetano.data.remote.apiary.user

import com.diegoferreiracaetano.model.User

data class UserRemote(
    var id: Int,
    var name: String,
    var email: String,
    var password: String
) {
    fun map() = User(
                    this.id,
                    this.name,
                    this.email,
                    this.password)
}
