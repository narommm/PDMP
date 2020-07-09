package com.example.pdmproyecto.nivelmedio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.pdmproyecto.R
import kotlinx.android.synthetic.main.fragment_multiplicacion_simple.view.*

/**
 * A simple [Fragment] subclass.
 */
class MultiplicacionSimple : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_multiplicacion_simple, container, false)
        //val binding = DataBindingUtil.inflate<MuliplicacionSimpleBinding>(inflater,R.layout.fragment_multiplicacion_simple,container,false)


    }

}
