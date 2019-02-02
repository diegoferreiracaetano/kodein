package com.diegoferreiracaetano.data.di

import com.diegoferreiracaetano.data.local.json.SettingsRepositoryLocal
import com.diegoferreiracaetano.data.remote.apiary.user.UserRepositoryRemote
import com.diegoferreiracaetano.domain.settings.SettingsRepository
import com.diegoferreiracaetano.domain.user.UserRepository
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider

val repositoryModule = Kodein.Module("repositoryModule") {
    bind<UserRepository>() with provider { UserRepositoryRemote(instance()) }
    bind<SettingsRepository>() with provider { SettingsRepositoryLocal(instance()) }
}