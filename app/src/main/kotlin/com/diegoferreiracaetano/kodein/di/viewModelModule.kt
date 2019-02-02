package com.diegoferreiracaetano.kodein.di

import androidx.lifecycle.ViewModelProvider
import com.diegoferreiracaetano.kodein.ui.user.UserViewModel
import com.diegoferreiracaetano.settings.ui.SettingsViewModel
import com.diegoferreiracaetano.util.ui.ViewModelFactory
import com.diegoferreiracaetano.util.ui.bindViewModel
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

val viewModelModule = Kodein.Module("viewModelModule") {

    bindViewModel<UserViewModel>() with provider {
        UserViewModel(instance())
    }

    bindViewModel<SettingsViewModel>() with provider {
        SettingsViewModel(instance())
    }

    bind<ViewModelProvider.Factory>() with singleton { ViewModelFactory(dkodein) }
}
