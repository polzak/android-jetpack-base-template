package net.polzak.jetpack

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StartViewModel: ViewModel() {

    var score = MutableLiveData<Int>()

    init {
        score.value = 0
    }

    fun addPoint() {
        score.value = (score.value)?.plus(1)
    }

    fun subtractPoint() {
        score.value = (score.value)?.minus(1)
    }

}