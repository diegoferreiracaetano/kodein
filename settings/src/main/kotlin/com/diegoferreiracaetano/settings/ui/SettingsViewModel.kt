package com.diegoferreiracaetano.settings.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.diegoferreiracaetano.domain.settings.GetSettingsInteractor
import com.diegoferreiracaetano.domain.util.Response

class SettingsViewModel(getSettingsInteractor: GetSettingsInteractor) : ViewModel() {
    private val settings = MutableLiveData<Response<String>>()

    init {
        getSettingsInteractor(Unit, settings)
    }

    fun getSettings() = settings
}