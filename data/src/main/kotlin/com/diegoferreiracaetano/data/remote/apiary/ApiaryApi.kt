package com.diegoferreiracaetano.data.remote.apiary

import com.diegoferreiracaetano.data.remote.apiary.user.UserRemote
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface ApiaryApi {

    @GET("users")
    fun getUsers(): Deferred<List<UserRemote>>
}
