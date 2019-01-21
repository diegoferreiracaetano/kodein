package com.diegoferreiracaetano.domain.user

import com.diegoferreiracaetano.model.User

interface UserRepository {

    suspend fun getUsers(): List<User>
}