package aplication.funmathhelper.pdmproyecto.registro

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegistroPregunta4ViewModel : ViewModel(){
    private val _respuesta_nivel_alto = MutableLiveData<Int>()
    val respuesta_nivel_alto : LiveData<Int>
        get() = _respuesta_nivel_alto

    private val _incorrecta_nivel_alto = MutableLiveData<Int>()
    val incorrecta_nivel_alto : LiveData<Int>
        get() = _incorrecta_nivel_alto


    init {
        _respuesta_nivel_alto.value=0
        _incorrecta_nivel_alto.value=0
    }

    fun correctoNivelAlto() {
        _respuesta_nivel_alto.value = Correctas.numeroCorrectasNivelAlto
    }

    fun incorrectoNivelAlto() {
        _incorrecta_nivel_alto.value = Incorrectas.numeroIncorrectasNivelAlto
    }
}