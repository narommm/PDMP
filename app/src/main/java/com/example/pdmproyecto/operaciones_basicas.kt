package com.example.pdmproyecto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.pdmproyecto.databinding.FragmentOpcionesInicialesBinding
import androidx.navigation.findNavController
import com.example.pdmproyecto.databinding.FragmentOperacionesBasicasBinding

/**
 * A simple [Fragment] subclass.
 */
class operaciones_basicas : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = DataBindingUtil.inflate<FragmentOperacionesBasicasBinding>(inflater, R.layout.fragment_operaciones_basicas, container,false)
        binding.opcionSuma.setOnClickListener {
            it.findNavController().navigate(R.id.action_operaciones_basicas_to_ejemplo_suma_1)
        }
        binding.opcionResta.setOnClickListener {
            it.findNavController().navigate(R.id.action_operaciones_basicas_to_resta_explicacion_uno)
        }
        binding.opcionMultiplicacion.setOnClickListener {
            it.findNavController().navigate(R.id.action_operaciones_basicas_to_opcion_tablas_multiplicar)
        }
        binding.opcionDivision.setOnClickListener {
            it.findNavController().navigate(R.id.action_opciones_iniciales_to_registro_actividades)
        }
        return binding.root
    }

}
