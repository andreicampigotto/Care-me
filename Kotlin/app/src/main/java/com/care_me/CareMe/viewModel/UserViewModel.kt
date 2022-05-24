package com.care_me.CareMe.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.care_me.CareMe.model.User
import com.care_me.CareMe.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val repository: UserRepository
) : ViewModel() {

    private val _userList = MutableLiveData<List<User>>()
    val userList: LiveData<List<User>> = _userList

    fun getUsers() {
        viewModelScope.launch {
            _userList.value = repository.getUsers()
        }
    }

    fun setUser(user: User) {
        viewModelScope.launch {
            repository.setUser(user)
        }
    }
}