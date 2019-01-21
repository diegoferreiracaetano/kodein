package com.diegoferreiracaetano.kodein.di

import com.diegoferreiracaetano.data.di.apiModule
import com.diegoferreiracaetano.data.di.httpCLientModule
import com.diegoferreiracaetano.data.di.repositoryModule
import com.diegoferreiracaetano.domain.di.interactorModule
import org.kodein.di.Kodein

val appModule = Kodein.Module("appModule") {

    import(httpCLientModule)
    import(apiModule)
    import(repositoryModule)
    import(interactorModule)
    import(viewModelModule)
}
