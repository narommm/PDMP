package com.example.pdmproyecto.nivelbajo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentSumaSimpleBinding
import kotlinx.android.synthetic.main.fragment_suma_simple.*

/**
 * A simple [Fragment] subclass.
 */
class SumaSimple : Fragment() {
    private var imagenesIndex = 0
    private var contadorClick = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSumaSimpleBinding>(inflater,R.layout.fragment_suma_simple,container,false)
        binding.pregunta2Cero.setOnClickListener {
            if (imagenesIndex < 2) {
                when(contadorClick){
                    0->{
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_cero)
                        contadorClick += 1
                    }
                    1->{
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_cero)
                        contadorClick += 1
                    }
                    2->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_suma_simple_to_registro_Pregunta1)
            }
        }
        binding.pregunta3Uno.setOnClickListener {
            if (imagenesIndex < 2) {
                when(contadorClick){
                    0->{
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_uno)
                        contadorClick += 1
                    }
                    1->{
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_uno)
                        contadorClick += 1
                    }
                    2->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_suma_simple_to_registro_Pregunta1)
            }
        }
        binding.pregunta3Dos.setOnClickListener {
            if (imagenesIndex < 2) {
                when(contadorClick){
                    0->{
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    1->{
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    2->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_suma_simple_to_registro_Pregunta1)
            }
        }
        binding.pregunta3Tres.setOnClickListener {
            if (imagenesIndex < 2) {
                when(contadorClick){
                    0->{
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_tres)
                        contadorClick += 1
                    }
                    1->{
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_tres)
                        contadorClick += 1
                    }
                    2->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_suma_simple_to_registro_Pregunta1)
            }
        }
        binding.pregunta3Cuatro.setOnClickListener {
            if (imagenesIndex < 2) {
                when(contadorClick){
                    0->{
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_cuatro)
                        contadorClick += 1
                    }
                    1->{
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_cuatro)
                        contadorClick += 1
                    }
                    2->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_suma_simple_to_registro_Pregunta1)
            }
        }
        binding.pregunta3Cinco.setOnClickListener {
            if (imagenesIndex < 2) {
                when(contadorClick){
                    0->{
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_cinco)
                        contadorClick += 1
                    }
                    1->{
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_cinco)
                        contadorClick += 1
                    }
                    2->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_suma_simple_to_registro_Pregunta1)
            }
        }
        binding.pregunta3Seis.setOnClickListener {
            if (imagenesIndex < 2) {
                when(contadorClick){
                    0->{
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_seis)
                        contadorClick += 1
                    }
                    1->{
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_seis)
                        contadorClick += 1
                    }
                    2->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_suma_simple_to_registro_Pregunta1)
            }
        }
        binding.pregunta3Siete.setOnClickListener {
            if (imagenesIndex < 2) {
                when(contadorClick){
                    0->{
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_siete)
                        contadorClick += 1
                    }
                    1->{
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_siete)
                        contadorClick += 1
                    }
                    2->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_suma_simple_to_registro_Pregunta1)
            }
        }
        binding.pregunta3Ocho.setOnClickListener {
            if (imagenesIndex < 2) {
                when(contadorClick){
                    0->{
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_ocho)
                        contadorClick += 1
                    }
                    1->{
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_ocho)
                        contadorClick += 1
                    }
                    2->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_suma_simple_to_registro_Pregunta1)
            }
        }
        binding.pregunta3Nueve.setOnClickListener {
            if (imagenesIndex < 2) {
                when(contadorClick){
                    0->{
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_nueve)
                        contadorClick += 1
                    }
                    1->{
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_nueve)
                        contadorClick += 1
                    }
                    2->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_suma_simple_to_registro_Pregunta1)
            }
        }
        return binding.root
    }

    private fun cambioPregunta(imagenesIndex: Int) {
        contadorClick = 0
        when (imagenesIndex) {
            0 -> pregunta1()
            1 -> pregunta2()
        }
    }

    private fun pregunta1() {
        //contadorClick = 0
        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta1.setImageResource(R.drawable.verde_pregunta_tres)
        imageView56.setImageResource(R.drawable.verde_pregunta_uno)
        imageView58.setImageResource(R.drawable.ama_pregunta_seis)
        respuesta2.setImageResource(R.drawable.ama_pregunta_siete)
    }

    private fun pregunta2() {
        //contadorClick = 0

        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta1.setImageResource(R.drawable.verde_pregunta_cuatro)
        imageView56.setImageResource(R.drawable.verde_pregunta_nueve)
        imageView58.setImageResource(R.drawable.ama_pregunta_tres)
        respuesta2.setImageResource(R.drawable.ama_pregunta_cero)
    }
        //return inflater.inflate(R.layout.fragment_suma_simple, container, false)

}

