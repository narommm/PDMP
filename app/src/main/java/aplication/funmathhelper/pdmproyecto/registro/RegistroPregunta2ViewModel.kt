package aplication.funmathhelper.pdmproyecto.registro

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegistroPregunta2ViewModel : ViewModel(){

    private val _respuesta_nivel_medio = MutableLiveData<Int>()
    val respuesta_nivel_medio : LiveData<Int>
        get() = _respuesta_nivel_medio

    private val _incorrecta_nivel_medio = MutableLiveData<Int>()
    val incorrecta_nivel_medio : LiveData<Int>
        get() = _incorrecta_nivel_medio


    init {
        _respuesta_nivel_medio.value=0
        _incorrecta_nivel_medio.value=0
    }


    fun correctoNivelMedio() {
        _respuesta_nivel_medio.value = Correctas.numeroCorrectasNivelMedio

    }


    fun incorrectoNivelMedio() {
        _incorrecta_nivel_medio.value = Incorrectas.numeroIncorrectasNivelMedio
    }
}