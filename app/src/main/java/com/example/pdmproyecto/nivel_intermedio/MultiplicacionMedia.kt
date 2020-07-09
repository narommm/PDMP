package com.example.pdmproyecto.nivel_intermedio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentMultiplicacionMediaBinding

/**
 * A simple [Fragment] subclass.
 */
class MultiplicacionMedia : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentMultiplicacionMediaBinding>(inflater,R.layout.fragment_multiplicacion_media,container,false)
        return inflater.inflate(R.layout.fragment_multiplicacion_media, container, false)
    }

}
