package com.diegoferreiracaetano.domain.settings

interface SettingsRepository {
    fun getSettings(): List<String>
}