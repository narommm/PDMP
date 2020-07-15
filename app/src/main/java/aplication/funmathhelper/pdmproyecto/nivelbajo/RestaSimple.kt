package aplication.funmathhelper.pdmproyecto.nivelbajo

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
import com.example.pdmproyecto.databinding.FragmentRestaSimpleBinding
import kotlinx.android.synthetic.main.fragment_resta_simple.*

/**
 * A simple [Fragment] subclass.
 */
class RestaSimple : Fragment() {
    private var imagenesIndex = 0
    private var contadorClick = 0
    private var respuestacorrecta1 = 0
    private var respuestacorrecta2 = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentRestaSimpleBinding>(
            inflater,
            R.layout.fragment_resta_simple,
            container,
            false
        )

        binding.pregunta2Cero.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=0
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_cero)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=0
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_cero)
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
                        respuestacorrecta1=1
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_uno)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=1
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_uno)
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
                        respuestacorrecta1=2
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=2
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_dos)
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
                        respuestacorrecta1=3
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_tres)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=3
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_tres)
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
                        respuestacorrecta1=4
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_cuatro)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=4
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_cuatro)
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
                        respuestacorrecta1=5
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_cinco)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=5
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_cinco)
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
                        respuestacorrecta1=6
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_seis)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=6
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_seis)
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
                        respuestacorrecta1=7
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_siete)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=7
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_siete)
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
                        respuestacorrecta1=8
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_ocho)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=8
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_ocho)
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
                        respuestacorrecta1=9
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_nueve)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=9
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_nueve)
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
        //última pregunta
        if(respuestacorrecta1==7 && respuestacorrecta2==4){
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
        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta1.setImageResource(R.drawable.verde_pregunta_dos)
        imageView56.setImageResource(R.drawable.verde_pregunta_dos)
        imageView58.setImageResource(R.drawable.ama_pregunta_uno)
        respuesta2.setImageResource(R.drawable.ama_pregunta_uno)
        //Respuestas guardadas de la pregunta anterior
        if(respuestacorrecta1==2 && respuestacorrecta2==2){
            Correctas.numeroCorrectasNivelBajo +=1
        }else{
            Incorrectas.numeroIncorrectasNivelBajo +=1
        }
    }

    private fun pregunta2() {
        //contadorClick = 0

        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta1.setImageResource(R.drawable.verde_pregunta_siete)
        imageView56.setImageResource(R.drawable.verde_pregunta_tres)
        imageView58.setImageResource(R.drawable.ama_pregunta_uno)
        respuesta2.setImageResource(R.drawable.ama_pregunta_cinco)
        if(respuestacorrecta1==1 && respuestacorrecta2==1){
            Correctas.numeroCorrectasNivelBajo +=1
        }else{
            Incorrectas.numeroIncorrectasNivelBajo +=1
        }
    }

    private fun pregunta3() {

        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta1.setImageResource(R.drawable.verde_pregunta_dos)
        imageView56.setImageResource(R.drawable.verde_pregunta_siete)
        imageView58.setImageResource(R.drawable.ama_pregunta_uno)
        respuesta2.setImageResource(R.drawable.ama_pregunta_seis)
        if(respuestacorrecta1==5 && respuestacorrecta2==8){
            Correctas.numeroCorrectasNivelBajo +=1
        }else{
            Incorrectas.numeroIncorrectasNivelBajo +=1
        }
    }

    private fun pregunta4() {

        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta1.setImageResource(R.drawable.verde_pregunta_ocho)
        imageView56.setImageResource(R.drawable.verde_pregunta_cero)
        imageView58.setImageResource(R.drawable.ama_pregunta_cero)
        respuesta2.setImageResource(R.drawable.ama_pregunta_seis)
        if(respuestacorrecta1==1 && respuestacorrecta2==1){
            Correctas.numeroCorrectasNivelBajo +=1
        }else{
            Incorrectas.numeroIncorrectasNivelBajo +=1
        }
    }
}


