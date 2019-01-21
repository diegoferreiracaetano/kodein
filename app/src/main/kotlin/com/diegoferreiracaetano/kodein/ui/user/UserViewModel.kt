package com.diegoferreiracaetano.kodein.ui.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.diegoferreiracaetano.domain.user.GetUsersInteractor
import com.diegoferreiracaetano.domain.util.Response
import com.diegoferreiracaetano.model.User

class UserViewModel(getUsersInteractor: GetUsersInteractor) : ViewModel() {

    private val _users = MutableLiveData<Response<List<User>>>()
    val users: LiveData<Response<List<User>>>
        get() = _users

    init {
        getUsersInteractor(Unit, _users)
    }
}
