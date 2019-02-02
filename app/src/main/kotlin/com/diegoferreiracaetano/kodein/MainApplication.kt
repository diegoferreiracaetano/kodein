package com.diegoferreiracaetano.kodein

import android.app.Application
import com.diegoferreiracaetano.kodein.di.appModule
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware

class MainApplication : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(appModule(this@MainApplication))
    }
}