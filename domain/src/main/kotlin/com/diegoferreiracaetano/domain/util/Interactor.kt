package com.diegoferreiracaetano.domain.util

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

abstract class Interactor<in P, R> : LiveData<R>() {

    private var job = Job()

    operator fun invoke(parameters: P, result: MutableLiveData<Response<R>>) {
        result.value = Response.Loading
        job = CoroutineScope(Dispatchers.IO).launch {
            try {
                create(parameters).let { useCaseResponse ->
                    result.postValue(Response.Success(useCaseResponse))
                }
            } catch (e: Throwable) {
                result.postValue(Response.Error(e))
            }
        }
    }
    override fun onInactive() {
        super.onInactive()
        job.cancel()
    }

    @Throws(RuntimeException::class)
    protected abstract suspend fun create(parameters: P): R
}