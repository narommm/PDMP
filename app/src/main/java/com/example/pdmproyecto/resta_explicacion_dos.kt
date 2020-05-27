package com.example.pdmproyecto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.pdmproyecto.databinding.FragmentRestaExplicacionDosBinding
import com.example.pdmproyecto.databinding.FragmentRestaExplicacionUnoBinding

/**
 * A simple [Fragment] subclass.
 */
class resta_explicacion_dos : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = DataBindingUtil.inflate<FragmentRestaExplicacionDosBinding>(inflater, R.layout.fragment_resta_explicacion_dos, container,false)
        binding.btnNextResta.setOnClickListener {
            //it.findNavController().navigate(R.id.action_resta_explicacion_uno_to_resta_explicacion_dos2)
        }
        return binding.root
    }

}
