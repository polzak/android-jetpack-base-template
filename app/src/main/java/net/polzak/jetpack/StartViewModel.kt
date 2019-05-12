package net.polzak.jetpack

import androidx.lifecycle.ViewModel

class StartViewModel: ViewModel() {

    var score = 0

    init {

    }

    fun addPoint() {
        score++
    }

    fun subtractPoint() {
        score--
    }

}