package com.example.pdmproyecto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.pdmproyecto.databinding.FragmentElegirTablaDeMultiplicarBinding
import com.example.pdmproyecto.databinding.FragmentOpcionTablasMultiplicarBinding

/**
 * A simple [Fragment] subclass.
 */
class elegir_tabla_de_multiplicar : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = DataBindingUtil.inflate<FragmentElegirTablaDeMultiplicarBinding>(inflater, R.layout.fragment_elegir_tabla_de_multiplicar, container,false)
        binding.iviewNumero1.setOnClickListener {
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_login)
        }
        binding.iviewNumero2.setOnClickListener {
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tabla_dos)
        }
        binding.iviewNumero3.setOnClickListener {
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tabla_tres)
        }
        binding.iviewNumero4.setOnClickListener {
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tabla_cuatro)
        }
        binding.iviewNumero5.setOnClickListener {
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tabla_cinco)
        }
        binding.iviewNumero6.setOnClickListener {
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tabla_seis)
        }
        binding.iviewNumero7.setOnClickListener {
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tabla_siete)
        }
        binding.iviewNumero8.setOnClickListener {
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tabla_ocho)
        }
        binding.iviewNumero9.setOnClickListener {
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tabla_nueve)
        }
        return binding.root
    }

}
