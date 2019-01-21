package com.diegoferreiracaetano.kodeintest.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.diegoferreiracaetano.kodeintest.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val fragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
        if (fragment is NavHostFragment) {
            NavigationUI.setupActionBarWithNavController(this, fragment.navController)
        }
    }

    override fun onSupportNavigateUp() = findNavController(R.id.nav_host_fragment).navigateUp()
}
