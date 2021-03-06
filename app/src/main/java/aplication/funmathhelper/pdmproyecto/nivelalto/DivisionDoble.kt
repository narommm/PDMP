package aplication.funmathhelper.pdmproyecto.nivelalto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import aplication.funmathhelper.pdmproyecto.registro.Correctas
import aplication.funmathhelper.pdmproyecto.registro.Incorrectas
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentDivisionDobleBinding
import kotlinx.android.synthetic.main.fragment_division_doble.*

/**
 * A simple [Fragment] subclass.
 */
class DivisionDoble : Fragment() {
    private var imagenesIndex = 0
    private var contadorClick = 0
    private var respuestacorrecta1 = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val binding = DataBindingUtil.inflate<FragmentDivisionDobleBinding>(inflater,R.layout.fragment_division_doble,container,false)
        binding.pregunta2Cero.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=0
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_cero)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionDoble_to_multiplicacionDoble)
            }
        }
        binding.pregunta3Uno.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=1
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_uno)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionDoble_to_multiplicacionDoble)
            }
        }
        binding.pregunta3Dos.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=2
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionDoble_to_multiplicacionDoble)
            }
        }
        binding.pregunta3Tres.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=3
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_tres)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionDoble_to_multiplicacionDoble)
            }
        }
        binding.pregunta3Cuatro.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=4
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_cuatro)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionDoble_to_multiplicacionDoble)
            }
        }
        binding.pregunta3Cinco.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=5
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_cinco)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionDoble_to_multiplicacionDoble)
            }
        }
        binding.pregunta3Seis.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=6
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_seis)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionDoble_to_multiplicacionDoble)
            }
        }
        binding.pregunta3Siete.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=7
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_siete)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionDoble_to_multiplicacionDoble)
            }
        }
        binding.pregunta3Ocho.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=8
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_ocho)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionDoble_to_multiplicacionDoble)
            }
        }
        binding.pregunta3Nueve.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=9
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_nueve)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionDoble_to_multiplicacionDoble)
            }
        }
        //RESPUESTA ULTIMA
        if(respuestacorrecta1==3){
            Correctas.numeroCorrectasNivelAlto+=1
        }else{
            Incorrectas.numeroIncorrectasNivelAlto+=1
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
        imageView62.setImageResource(R.drawable.verde_pregunta_ocho)
        respuesta1.setImageResource(R.drawable.verde_pregunta_cero)
        imageView56.setImageResource(R.drawable.ama_pregunta_uno)
        imageView67.setImageResource(R.drawable.ama_pregunta_seis)
        //RESPUESTA PREGUNTA DEFAULT
        if(respuestacorrecta1==5){
            Correctas.numeroCorrectasNivelAlto+=1
        }else{
            Incorrectas.numeroIncorrectasNivelAlto+=1
        }
    }
    private fun pregunta2() {
        //contadorClick = 0
        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        imageView62.setImageResource(R.drawable.verde_pregunta_seis)
        respuesta1.setImageResource(R.drawable.verde_pregunta_cuatro)
        imageView56.setImageResource(R.drawable.ama_pregunta_uno)
        imageView67.setImageResource(R.drawable.ama_pregunta_seis)
        //RESPUESTA PREGUNTA 3
        if(respuestacorrecta1==4){
            Correctas.numeroCorrectasNivelAlto+=1
        }else{
            Incorrectas.numeroIncorrectasNivelAlto+=1
        }
    }



}
