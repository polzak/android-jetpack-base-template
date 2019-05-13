package net.polzak.jetpack

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StartViewModel: ViewModel() {

    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    init {
        _score.value = 0
    }

    fun addPoint() {
        _score.value = (_score.value)?.plus(1)
    }

    fun subtractPoint() {
        _score.value = (_score.value)?.minus(1)
    }

}