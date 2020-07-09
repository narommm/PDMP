package com.example.pdmproyecto

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.pdmproyecto.databinding.FragmentOpcionesInicialesBinding


class opciones_iniciales : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var binding = DataBindingUtil.inflate<FragmentOpcionesInicialesBinding>(inflater, R.layout.fragment_opciones_iniciales, container,false)
        binding.btOperaciones.setOnClickListener {
            it.findNavController().navigate(R.id.action_opciones_iniciales_to_operaciones_basicas)
        }
        binding.btMisiones.setOnClickListener {
            it.findNavController().navigate(R.id.action_opciones_iniciales_to_misiones_menu)
        }
        binding.btRegistro.setOnClickListener {
            it.findNavController().navigate(R.id.action_opciones_iniciales_to_registro_actividades2)
        }
        //(activity as AppCompatActivity).supportActionBar?.title = "Quiz Application"


        return binding.root
    }

}
