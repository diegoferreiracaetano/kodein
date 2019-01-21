package com.diegoferreiracaetano.data.di

import com.diegoferreiracaetano.data.BuildConfig
import com.diegoferreiracaetano.data.remote.apiary.ApiaryApi
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val apiModule = Kodein.Module("apiModule") {

    bind<ApiaryApi>() with singleton {

        val retrofit = Retrofit.Builder()
            .client(instance())
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()

        retrofit.create(ApiaryApi::class.java)
    }
}