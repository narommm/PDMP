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

    lateinit var binding: FragmentElegirTablaDeMultiplicarBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = DataBindingUtil.inflate<com.example.pdmproyecto.databinding.FragmentElegirTablaDeMultiplicarBinding>(inflater, R.layout.fragment_elegir_tabla_de_multiplicar, container,false)

        binding.iviewNumero1.setOnClickListener {
            it.findNavController().navigate(R.id.action_elegir_tabla_de_multiplicar_to_tablas)
        }
        return binding.root
    }

}
