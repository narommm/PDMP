package com.example.pdmproyecto.ejemploMultiplicacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pdmproyecto.R

/**
 * A simple [Fragment] subclass.
 */
class fragments_ejemplo_multiplicacion_1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(
            R.layout.fragment_fragments_ejemplo_multiplicacion_1,
            container,
            false
        )
    }

}
