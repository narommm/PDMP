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
import com.example.pdmproyecto.databinding.FragmentTablasBinding
import com.example.pdmproyecto.tablasmultiplicar.TablasChoice

/**
 * A simple [Fragment] subclass.
 */
class elegir_tabla_de_multiplicar : Fragment() {

    lateinit var binding: FragmentElegirTablaDeMultiplicarBinding
    lateinit var bindingTablas : FragmentTablasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = DataBindingUtil.inflate<FragmentElegirTablaDeMultiplicarBinding>(inflater, R.layout.fragment_elegir_tabla_de_multiplicar, container,false)

        binding.iviewNumero1.setOnClickListener {
            TablasChoice.tabla = 1
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tablas)
        }
        binding.iviewNumero2.setOnClickListener {
            TablasChoice.tabla = 2
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tablas)
        }
        binding.iviewNumero3.setOnClickListener {
            TablasChoice.tabla=3
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tablas)
        }
        binding.iviewNumero4.setOnClickListener {
            TablasChoice.tabla=4
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tablas)
        }
        binding.iviewNumero5.setOnClickListener {
            TablasChoice.tabla=5
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tablas)
        }
        binding.iviewNumero6.setOnClickListener {
            TablasChoice.tabla=6
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tablas)
        }
        binding.iviewNumero7.setOnClickListener {
            TablasChoice.tabla=7
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tablas)
        }
        binding.iviewNumero8.setOnClickListener {
            TablasChoice.tabla=8
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tablas)
        }
        binding.iviewNumero9.setOnClickListener {
            TablasChoice.tabla=9
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tablas)
        }
        return binding.root
    }

}
