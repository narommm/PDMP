package aplication.funmathhelper.pdmproyecto.registro

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegistroPregunta1ViewModel : ViewModel(){
    private val _respuesta_nivel_bajo = MutableLiveData<Int>()
    val respuesta_nivel_bajo : LiveData<Int>
        get() = _respuesta_nivel_bajo

    private val _incorrecta_nivel_bajo = MutableLiveData<Int>()
    val incorrecta_nivel_bajo : LiveData<Int>
        get() = _incorrecta_nivel_bajo


    init {
        _respuesta_nivel_bajo.value=0
        _incorrecta_nivel_bajo.value=0
    }
    fun correctoNivelBajo() {
        _respuesta_nivel_bajo.value = Correctas.numeroCorrectasNivelBajo
    }

    fun incorrectoNivelBajo() {
        _incorrecta_nivel_bajo.value = Incorrectas.numeroIncorrectasNivelBajo
    }
}