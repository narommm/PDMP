package com.example.pdmproyecto.registro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentRegistroBinding
import kotlinx.android.synthetic.main.fragment_registro_actividades.*

/**
 * A simple [Fragment] subclass.
 */
class registro_actividades : Fragment() {
   val binding:Fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding= DataBindingUtil.inflate<FragmentRegistroActividadesBinding>(inflater,R.layout.fragment_registro_actividades,container,false)
        //return inflater.inflate(R.layout.fragment_registro_actividades, container, false)

        nBajo.setOnClickListener {
            it.findNavController().navigate(R.id.action_registro_actividades2_to_registro_Pregunta1)
        }

        //return binding.root
    }

}
