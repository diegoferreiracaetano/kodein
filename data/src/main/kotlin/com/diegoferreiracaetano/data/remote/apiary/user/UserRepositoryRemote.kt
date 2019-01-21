package com.diegoferreiracaetano.data.remote.apiary.user

import com.diegoferreiracaetano.data.remote.apiary.ApiaryApi
import com.diegoferreiracaetano.domain.user.UserRepository

class UserRepositoryRemote(private val api: ApiaryApi) : UserRepository {

    override suspend fun getUsers() = api.getUsers()
        .await()
        .map { it.map() }
        .toList()
}