package com.diegoferreiracaetano.domain.settings

import com.diegoferreiracaetano.domain.util.Interactor

class GetSettingsInteractor(private val repository: SettingsRepository) : Interactor<Unit, String>() {

    override suspend fun create(parameters: Unit) = repository.getSettings()
}