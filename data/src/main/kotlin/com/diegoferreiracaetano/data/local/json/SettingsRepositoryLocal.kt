package com.diegoferreiracaetano.data.local.json

import android.content.Context
import com.diegoferreiracaetano.domain.settings.SettingsRepository
import java.io.IOException
import java.io.InputStream

class SettingsRepositoryLocal(private val context: Context) : SettingsRepository {

    override fun getSettings(): String {
        val file = context.assets.open("list.json")
        return loadJSONFromAsset(file)
    }
}

fun loadJSONFromAsset(file: InputStream): String {
    var json = ""
    try {
        val size = file.available()
        val buffer = ByteArray(size)
        file.read(buffer)
        file.close()
        json = String(buffer, Charsets.UTF_8)
    } catch (ex: IOException) {
        ex.printStackTrace()
    }
    return json
}
