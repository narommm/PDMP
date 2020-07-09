package com.example.pdmproyecto.registro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.pdmproyecto.R

/**
 * A simple [Fragment] subclass.
 */
class Registro_Pregunta1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //val binding= DataBindingUtil.inflate<FragmentRegistroPregunta1>(inflater,R.layout.fragment_registro_actividades,container,false)

        return inflater.inflate(R.layout.fragment_registro__pregunta1, container, false)
    }

}
