package com.example.ururun.ui.screens

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BuyingScreenViewModel : ViewModel() {
    private val _amtMyWallet = MutableLiveData(300000)
    val amtMyWallet: LiveData<Int> get() = _amtMyWallet

    fun purchase(productValue: Int) {
//        _amtMyWallet.postValue(amtMyWallet.value!! - productValue)
        _amtMyWallet.value = _amtMyWallet.value!! - productValue
    }

    fun sale(productValue: Int) {
//        _amtMyWallet.postValue(amtMyWallet.value!! - productValue)
        _amtMyWallet.value = _amtMyWallet.value!! + productValue
    }
}