package com.diegoferreiracaetano.kodein.di

import com.diegoferreiracaetano.data.di.apiModule
import com.diegoferreiracaetano.data.di.httpCLientModule
import com.diegoferreiracaetano.data.di.repositoryModule
import com.diegoferreiracaetano.domain.di.interactorModule
import com.diegoferreiracaetano.kodein.MainApplication
import org.kodein.di.Kodein
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton

fun appModule(application: MainApplication) = Kodein.Module("appModule") {

    import(androidXModule(application))
    import(httpCLientModule)
    import(apiModule)
    import(repositoryModule)
    import(interactorModule)
    import(viewModelModule)

    bind() from singleton { application.applicationContext }
}
