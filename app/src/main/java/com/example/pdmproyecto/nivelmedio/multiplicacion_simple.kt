package com.example.pdmproyecto.nivelmedio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pdmproyecto.R

/**
 * A simple [Fragment] subclass.
 */
class multiplicacion_simple : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_multiplicacion_simple, container, false)
    }

}
