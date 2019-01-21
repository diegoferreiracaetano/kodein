package com.diegoferreiracaetano.domain.user

import com.diegoferreiracaetano.domain.util.Interactor
import com.diegoferreiracaetano.model.User

class GetUsersInteractor(private val repository: UserRepository) : Interactor<Unit, List<User>>() {

    override suspend fun create(parameters: Unit): List<User> {
        return repository.getUsers()
    }
}