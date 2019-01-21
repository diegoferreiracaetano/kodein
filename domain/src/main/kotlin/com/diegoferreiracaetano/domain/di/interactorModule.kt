package com.diegoferreiracaetano.domain.di

import com.diegoferreiracaetano.domain.user.GetUsersInteractor
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

val interactorModule = Kodein.Module("interactorModule") {
    bind() from singleton { GetUsersInteractor(instance()) }
}