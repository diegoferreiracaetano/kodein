package com.diegoferreiracaetano.settings.ui
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.diegoferreiracaetano.domain.util.Response
import com.diegoferreiracaetano.settings.R
import com.diegoferreiracaetano.util.ui.viewModel
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.closestKodein
import kotlinx.android.synthetic.main.fragment_settings.text

class SettingsFragment : Fragment() , KodeinAware {

    override val kodein: Kodein by closestKodein()

    private val viewModel: SettingsViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getSettings().observe(this, Observer {
            if(it is Response.Success && it.data.isNotEmpty()){
                it.data.forEach {
                    text.text = it
                }
            }
        })
    }

}
