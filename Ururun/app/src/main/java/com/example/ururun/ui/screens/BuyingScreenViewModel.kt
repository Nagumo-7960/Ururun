package com.example.ururun.ui.screens

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BuyingScreenViewModel:ViewModel(){
    private val _amtMyWallet = MutableLiveData(3000000)
    val amtMyWallet: LiveData<Int>get() = _amtMyWallet

    fun RefeshMyWallet(productValue:Int){
        _amtMyWallet.value = _amtMyWallet.value!! - productValue
    }

}