package com.example.pdmproyecto.ejemplomultiplicacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentFragmentsEjemploMultiplicacion1Binding

/**
 * A simple [Fragment] subclass.
 */
class EjemploMultiplicacion1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentFragmentsEjemploMultiplicacion1Binding>(inflater,
        R.layout.fragment_fragments_ejemplo_multiplicacion_1,container,false)

        binding.btnNextSuma.setOnClickListener {
            it.findNavController().navigate(R.id.action_fragments_ejemplo_multiplicacion_1_to_ejemplo_multiplicacion_2)
        }
        return binding.root
    }

}
