package com.example.pdmproyecto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.pdmproyecto.databinding.FragmentEjemploSuma1Binding
import com.example.pdmproyecto.databinding.FragmentOperacionesBasicasBinding

/**
 * A simple [Fragment] subclass.
 */
class ejemplo_suma_1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = DataBindingUtil.inflate<FragmentEjemploSuma1Binding>(inflater, R.layout.fragment_ejemplo_suma_1, container,false)
        binding.btnNextSuma.setOnClickListener {
            it.findNavController().navigate(R.id.action_ejemplo_suma_1_to_ejemplo_suma_2)
        }
        return binding.root
    }

}
