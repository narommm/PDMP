package aplication.funmathhelper.pdmproyecto.registro

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class RegistroPregunta3ViewModel : ViewModel(){

    private val _respuesta_nivel_intermedio = MutableLiveData<Int>()
    val respuesta_nivel_intermedio : LiveData<Int>
        get() = _respuesta_nivel_intermedio


    private val _incorrecta_nivel_intermedio = MutableLiveData<Int>()
    val incorrecta_nivel_intermedio : LiveData<Int>
        get() = _incorrecta_nivel_intermedio


    init {
        _respuesta_nivel_intermedio.value=0
        _incorrecta_nivel_intermedio.value=0
    }

    fun correctoNivelIntermedio() {
        _respuesta_nivel_intermedio.value = Correctas.numeroCorrectasNivelIntermedio

    }
    fun incorrectoNivelIntermedio() {
        _incorrecta_nivel_intermedio.value = Incorrectas.numeroIncorrectasNivelIntermedio
    }
}