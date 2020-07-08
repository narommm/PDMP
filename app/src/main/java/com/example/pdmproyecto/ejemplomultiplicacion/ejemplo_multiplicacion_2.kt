package com.example.pdmproyecto.ejemplomultiplicacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentEjemploMultiplicacion2Binding
import com.example.pdmproyecto.ejemplosresta.resta_explicacion_uno

/**
 * A simple [Fragment] subclass.
 */
class ejemplo_multiplicacion_2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding=DataBindingUtil.inflate<FragmentEjemploMultiplicacion2Binding>(inflater,R.layout.fragment_ejemplo_multiplicacion_2,container,false)

        binding.btnNextSuma.setOnClickListener {
            it.findNavController().navigate(R.id.action_ejemplo_multiplicacion_2_to_ejemplo_multiplicacion_3)
        }
        return binding.root
    }

}
