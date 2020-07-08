package com.example.pdmproyecto.ejemplomultiplicacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentEjemploMultiplicacion3Binding

/**
 * A simple [Fragment] subclass.
 */
class EjemploMultiplicacion3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentEjemploMultiplicacion3Binding>(inflater, R.layout.fragment_ejemplo_multiplicacion_3,container,false)

        binding.btnSiguiente.setOnClickListener {
            it.findNavController().navigate(R.id.action_ejemplo_multiplicacion_3_to_ejemplo_multiplicacion_4)
        }
        return binding.root
    }

}
