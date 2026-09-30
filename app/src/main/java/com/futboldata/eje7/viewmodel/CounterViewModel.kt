package com.futboldata.eje7.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    // Valor actual del contador, inicia en 0
    var contador by mutableIntStateOf(0)
        private set

    fun incrementar() {
        contador += 1
    }

    fun reiniciar() {
        contador = 0
    }
}
