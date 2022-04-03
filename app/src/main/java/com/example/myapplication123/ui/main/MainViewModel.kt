package com.example.myapplication123.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.lang.Thread.sleep

class MainViewModel (private val liveDataToObserve : MutableLiveData<Any> = MutableLiveData()) : ViewModel()
{
    fun getLiveData() = liveDataToObserve

    fun getWeather() = getDataFromLocalSource()

    private fun getDataFromLocalSource(){
        Thread{
            sleep(1000)
            liveDataToObserve.postValue(Any())
        }.start()
    }
}