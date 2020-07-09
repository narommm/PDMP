package com.example.pdmproyecto.registro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentRegistroBinding

/**
 * A simple [Fragment] subclass.
 */
class registro_actividades : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //val binding= DataBindingUtil.inflate<FragmentRegistroBinding>(inflater,R.layout.fragment_registro_actividades,container,false)
        return inflater.inflate(R.layout.fragment_registro_actividades, container, false)


        //return binding.root
    }

}
