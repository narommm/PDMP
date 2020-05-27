package com.example.pdmproyecto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.pdmproyecto.databinding.FragmentOpcionTablasMultiplicarBinding
import com.example.pdmproyecto.databinding.FragmentOperacionesBasicasBinding

/**
 * A simple [Fragment] subclass.
 */
class opcion_tablas_multiplicar : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = DataBindingUtil.inflate<FragmentOpcionTablasMultiplicarBinding>(inflater, R.layout.fragment_opcion_tablas_multiplicar, container,false)
        binding.btnMultEjemplos2.setOnClickListener {
            it.findNavController().navigate(R.id.action_operaciones_basicas_to_ejemplo_suma_1)
        }
        binding.btnMultTablas.setOnClickListener {
            it.findNavController().navigate(R.id.action_opcion_tablas_multiplicar_to_elegir_tabla_de_multiplicar)
        }
        return binding.root
    }

}
