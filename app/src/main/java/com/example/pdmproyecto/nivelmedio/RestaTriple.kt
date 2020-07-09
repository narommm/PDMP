package com.example.pdmproyecto.nivelmedio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentRestaSimpleBinding
import com.example.pdmproyecto.databinding.FragmentRestaTripleBinding
import kotlinx.android.synthetic.main.fragment_resta_triple.*

/**
 * A simple [Fragment] subclass.
 */
class RestaTriple : Fragment() {

    private var imagenesIndex = 0
    private var contadorClick = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentRestaTripleBinding>(inflater,R.layout.fragment_resta_triple,container,false)

        binding.pregunta2Cero.setOnClickListener {
            if (imagenesIndex < 5) {
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
                it.findNavController().navigate(R.id.action_nivel_bajo_pregunta_3_to_suma_simple)
            }
        }
        binding.pregunta3Uno.setOnClickListener {
            if (imagenesIndex < 5) {
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
                it.findNavController().navigate(R.id.action_nivel_bajo_pregunta_3_to_suma_simple)
            }
        }
        binding.pregunta3Dos.setOnClickListener {
            if (imagenesIndex < 5) {
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
                it.findNavController().navigate(R.id.action_nivel_bajo_pregunta_3_to_suma_simple)
            }
        }
        binding.pregunta3Dos.setOnClickListener {
            if (imagenesIndex < 5) {
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
                it.findNavController().navigate(R.id.action_nivel_bajo_pregunta_3_to_suma_simple)
            }
        }
        binding.pregunta3Tres.setOnClickListener {
            if (imagenesIndex < 5) {
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
                it.findNavController().navigate(R.id.action_nivel_bajo_pregunta_3_to_suma_simple)
            }
        }
        binding.pregunta3Cuatro.setOnClickListener {
            if (imagenesIndex < 5) {
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
                it.findNavController().navigate(R.id.action_nivel_bajo_pregunta_3_to_suma_simple)
            }
        }
        binding.pregunta3Cinco.setOnClickListener {
            if (imagenesIndex < 5) {
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
                it.findNavController().navigate(R.id.action_nivel_bajo_pregunta_3_to_suma_simple)
            }
        }
        binding.pregunta3Seis.setOnClickListener {
            if (imagenesIndex < 5) {
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
                it.findNavController().navigate(R.id.action_nivel_bajo_pregunta_3_to_suma_simple)
            }
        }
        binding.pregunta3Siete.setOnClickListener {
            if (imagenesIndex < 5) {
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
                it.findNavController().navigate(R.id.action_nivel_bajo_pregunta_3_to_suma_simple)
            }
        }
        binding.pregunta3Ocho.setOnClickListener {
            if (imagenesIndex < 5) {
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
                it.findNavController().navigate(R.id.action_nivel_bajo_pregunta_3_to_suma_simple)
            }
        }
        binding.pregunta3Nueve.setOnClickListener {
            if (imagenesIndex < 5) {
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
                        binding.imageView55.setImageResource(R.drawable.verde_pregunta_siete)
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_nivel_bajo_pregunta_3_to_suma_simple)
            }
        }
        return binding.root
    }

    private fun cambioPregunta(imagenesIndex: Int) {
        contadorClick = 0
        when (imagenesIndex) {
            0 -> pregunta1()
            1 -> pregunta2()
            2 -> pregunta3()
            3 -> pregunta4()
        }
    }

    private fun pregunta1() {
        //contadorClick = 0
        respuesta_1.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta_2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta_3.setImageResource(R.drawable.anara_signo_interrogacion)
        imageView55.setImageResource(R.drawable.verde_pregunta_tres)
        imageView56.setImageResource(R.drawable.verde_pregunta_cero)
        imageView54.setImageResource(R.drawable.verde_pregunta_cinco)
        imageView58.setImageResource(R.drawable.ama_pregunta_uno)
        imageView59.setImageResource(R.drawable.ama_pregunta_seis)
        imageView60.setImageResource(R.drawable.ama_pregunta_dos)
    }

    private fun pregunta2() {
        //contadorClick = 0
        respuesta_1.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta_2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta_3.setImageResource(R.drawable.anara_signo_interrogacion)
        imageView55.setImageResource(R.drawable.verde_pregunta_tres)
        imageView56.setImageResource(R.drawable.verde_pregunta_cero)
        imageView54.setImageResource(R.drawable.verde_pregunta_cinco)
        imageView58.setImageResource(R.drawable.ama_pregunta_uno)
        imageView59.setImageResource(R.drawable.ama_pregunta_seis)
        imageView60.setImageResource(R.drawable.ama_pregunta_dos)
    }

    private fun pregunta3() {
        //contadorClick = 0
        respuesta_1.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta_2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta_3.setImageResource(R.drawable.anara_signo_interrogacion)
        imageView55.setImageResource(R.drawable.verde_pregunta_tres)
        imageView56.setImageResource(R.drawable.verde_pregunta_cero)
        imageView54.setImageResource(R.drawable.verde_pregunta_cinco)
        imageView58.setImageResource(R.drawable.ama_pregunta_uno)
        imageView59.setImageResource(R.drawable.ama_pregunta_seis)
        imageView60.setImageResource(R.drawable.ama_pregunta_dos)
    }

    private fun pregunta4() {
        //contadorClick = 0
        respuesta_1.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta_2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta_3.setImageResource(R.drawable.anara_signo_interrogacion)
        imageView55.setImageResource(R.drawable.verde_pregunta_tres)
        imageView56.setImageResource(R.drawable.verde_pregunta_cero)
        imageView54.setImageResource(R.drawable.verde_pregunta_cinco)
        imageView58.setImageResource(R.drawable.ama_pregunta_uno)
        imageView59.setImageResource(R.drawable.ama_pregunta_seis)
        imageView60.setImageResource(R.drawable.ama_pregunta_dos)
    }

}
