package aplication.funmathhelper.pdmproyecto.nivelmedio

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
import com.example.pdmproyecto.databinding.FragmentDivisionSimpleBinding
import kotlinx.android.synthetic.main.fragment_division_simple.*

/**
 * A simple [Fragment] subclass.
 */
class DivisionSimple : Fragment() {
    private var imagenesIndex = 0
    private var contadorClick = 0
    private var respuestacorrecta1 = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentDivisionSimpleBinding>(inflater,R.layout.fragment_division_simple,container,false)

        binding.pregunta2Cero.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=0
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_cero)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionSimple_to_registro_pregunta3)
            }
        }
        binding.pregunta3Uno.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=1
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_uno)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionSimple_to_registro_pregunta3)
            }
        }
        binding.pregunta3Dos.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=2
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionSimple_to_registro_pregunta3)
            }
        }
        binding.pregunta3Dos.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=2
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionSimple_to_registro_pregunta3)
            }
        }
        binding.pregunta3Tres.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=3
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_tres)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionSimple_to_registro_pregunta3)
            }
        }
        binding.pregunta3Cuatro.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=4
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_cuatro)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionSimple_to_registro_pregunta3)
            }
        }
        binding.pregunta3Cinco.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=5
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_cinco)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionSimple_to_registro_pregunta3)
            }
        }
        binding.pregunta3Seis.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=6
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_seis)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionSimple_to_registro_pregunta3)
            }
        }
        binding.pregunta3Siete.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=7
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_siete)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionSimple_to_registro_pregunta3)
            }
        }
        binding.pregunta3Ocho.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=8
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_ocho)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionSimple_to_registro_pregunta3)
            }
        }
        binding.pregunta3Nueve.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=9
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_nueve)
                        contadorClick += 1
                    }
                    1->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_divisionSimple_to_registro_pregunta3)
            }
        }
        //RESPUESTA PREGUNTA DEFAULT
        if(respuestacorrecta1==1){
            Correctas.numeroCorrectasNivelBajo+=1
        }else{
            Incorrectas.numeroIncorrectasNivelBajo+=1
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
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta1.setImageResource(R.drawable.verde_pregunta_seis)
        imageView56.setImageResource(R.drawable.verde_pregunta_dos)
        //RESPUESTA PREGUNTA DEFAULT
        if(respuestacorrecta1==3){
            Correctas.numeroCorrectasNivelIntermedio+=1
        }else{
            Incorrectas.numeroIncorrectasNivelIntermedio+=1
        }
    }

    private fun pregunta2() {
        //contadorClick = 0
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta1.setImageResource(R.drawable.verde_pregunta_ocho)
        imageView56.setImageResource(R.drawable.ama_pregunta_cuatro)
        //RESPUESTA PREGUNTA 1
        if(respuestacorrecta1==3){
            Correctas.numeroCorrectasNivelIntermedio+=1
        }else{
            Incorrectas.numeroIncorrectasNivelIntermedio+=1
        }
    }

    private fun pregunta3() {
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta1.setImageResource(R.drawable.verde_pregunta_nueve)
        imageView56.setImageResource(R.drawable.verde_pregunta_tres)
        //RESPUESTA PREGUNTA 2
        if(respuestacorrecta1==2){
            Correctas.numeroCorrectasNivelIntermedio+=1
        }else{
            Incorrectas.numeroIncorrectasNivelIntermedio+=1
        }
    }

    private fun pregunta4() {
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta1.setImageResource(R.drawable.verde_pregunta_cinco)
        imageView56.setImageResource(R.drawable.verde_pregunta_cinco)
        //RESPUESTA PREGUNTA 3
        if(respuestacorrecta1==3){
            Correctas.numeroCorrectasNivelBajo+=1
        }else{
            Incorrectas.numeroIncorrectasNivelBajo+=1
        }
    }
}
