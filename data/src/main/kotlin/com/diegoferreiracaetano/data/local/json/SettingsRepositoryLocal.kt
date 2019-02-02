package com.diegoferreiracaetano.data.local.json

import android.content.Context
import com.diegoferreiracaetano.domain.settings.SettingsRepository

class SettingsRepositoryLocal(context: Context) : SettingsRepository {

    override fun getSettings(): List<String> {
        return listOf("Settings 1", "Settings 2")
    }
}