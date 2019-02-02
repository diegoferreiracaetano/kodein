package com.diegoferreiracaetano.domain.settings

import com.diegoferreiracaetano.domain.util.Interactor

class GetSettingsInteractor(private val repository: SettingsRepository) : Interactor<Unit, List<String>>() {

    override suspend fun create(parameters: Unit): List<String> {
        return repository.getSettings()
    }
}