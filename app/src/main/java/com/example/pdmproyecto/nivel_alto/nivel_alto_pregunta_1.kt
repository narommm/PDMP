package com.example.pdmproyecto.nivel_alto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.add
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentNivelAltoPregunta1Binding
import kotlinx.android.synthetic.main.fragment_nivel_alto_pregunta_1.*
import kotlinx.android.synthetic.main.fragment_nivel_alto_pregunta_2.*

/**
 * A simple [Fragment] subclass.
 */
class nivel_alto_pregunta_1 : Fragment() {

    lateinit var binding : FragmentNivelAltoPregunta1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_nivel_alto_pregunta_1, container, false)
        //manejoTransacciones()
    }


    /*private fun manejoTransacciones(){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val newFragment = nivel_alto_pregunta_2()

        binding.pregunta3Tres.setOnClickListener {
            binding.respuesta1.setImageResource(R.drawable.anara_pregunta_tres)
            val transaction = supportFragmentManager.beginTransaction().apply {
                replace(R.id.nivel_alto_pregunta1, newFragment)
                addToBackStack(null)
            }
            transaction.commit();
        }
    }*/

}
