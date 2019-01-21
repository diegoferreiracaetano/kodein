package com.diegoferreiracaetano.kodein.ui.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.diegoferreiracaetano.domain.util.Response
import com.diegoferreiracaetano.kodein.R
import com.diegoferreiracaetano.kodein.util.viewModel
import kotlinx.android.synthetic.main.user_fragment.*
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.closestKodein

class UserFragment : Fragment(), KodeinAware {

    override val kodein: Kodein by closestKodein()

    private val viewModel: UserViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.user_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.users.observe(this, Observer {
            if (it is Response.Success) {
                var name = ""
                it.data.forEach {
                    name += it.name + "\n"
                }
                message.text = name
            }
        })
    }
}
