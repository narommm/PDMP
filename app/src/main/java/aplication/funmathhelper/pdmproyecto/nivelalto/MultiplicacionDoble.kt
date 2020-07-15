package aplication.funmathhelper.pdmproyecto.nivelalto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import aplication.funmathhelper.pdmproyecto.registro.Correctas
import aplication.funmathhelper.pdmproyecto.registro.Incorrectas
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentMultiplicacionDobleBinding
import kotlinx.android.synthetic.main.fragment_multiplicacion_doble.*

/**
 * A simple [Fragment] subclass.
 */
class MultiplicacionDoble : Fragment() {
    private var imagenesIndex = 0
    private var contadorClick = 0
    private var respuestacorrecta1 = 0
    private var respuestacorrecta2 = 0
    private var respuestacorrecta3 = 0
    private var respuestacorrecta4 = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentMultiplicacionDobleBinding>(inflater,R.layout.fragment_multiplicacion_doble,container,false)

        binding.pregunta2Cero.setOnClickListener {
            if (imagenesIndex < 2) {
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
                        respuestacorrecta3=0
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_cero)
                        contadorClick += 1
                    }
                    3->{
                        respuestacorrecta4=0
                        binding.respuesta4.setImageResource(R.drawable.anara_pregunta_cero)
                        contadorClick += 1
                    }
                    4->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionDoble_to_registro_pregunta4)
            }
        }
        binding.pregunta3Uno.setOnClickListener {
            if (imagenesIndex < 2) {
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
                        respuestacorrecta3=1
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_uno)
                        contadorClick += 1
                    }
                    3->{
                        respuestacorrecta4=1
                        binding.respuesta4.setImageResource(R.drawable.anara_pregunta_uno)
                        contadorClick += 1
                    }
                    4->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionDoble_to_registro_pregunta4)
            }
        }
        binding.pregunta3Dos.setOnClickListener {
            if (imagenesIndex < 2) {
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
                        respuestacorrecta3=2
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    3->{
                        respuestacorrecta4=2
                        binding.respuesta4.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    4->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionDoble_to_registro_pregunta4)
            }
        }
        binding.pregunta3Tres.setOnClickListener {
            if (imagenesIndex < 2) {
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
                        respuestacorrecta3=3
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_tres)
                        contadorClick += 1
                    }
                    3->{
                        respuestacorrecta3=3
                        binding.respuesta4.setImageResource(R.drawable.anara_pregunta_tres)
                        contadorClick += 1
                    }
                    4->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionDoble_to_registro_pregunta4)
            }
        }
        binding.pregunta3Cuatro.setOnClickListener {
            if (imagenesIndex < 2) {
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
                        respuestacorrecta3=4
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_cuatro)
                        contadorClick += 1
                    }
                    3->{
                        respuestacorrecta4=4
                        binding.respuesta4.setImageResource(R.drawable.anara_pregunta_cuatro)
                        contadorClick += 1
                    }
                    4->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionDoble_to_registro_pregunta4)
            }
        }
        binding.pregunta3Cinco.setOnClickListener {
            if (imagenesIndex < 2) {
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
                        respuestacorrecta3=5
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_cinco)
                        contadorClick += 1
                    }
                    3->{
                        respuestacorrecta4=5
                        binding.respuesta4.setImageResource(R.drawable.anara_pregunta_cinco)
                        contadorClick += 1
                    }
                    4->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionDoble_to_registro_pregunta4)
            }
        }
        binding.pregunta3Seis.setOnClickListener {
            if (imagenesIndex < 2) {
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
                        respuestacorrecta3=6
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_seis)
                        contadorClick += 1
                    }
                    3->{
                        respuestacorrecta4=6
                        binding.respuesta4.setImageResource(R.drawable.anara_pregunta_seis)
                        contadorClick += 1
                    }
                    4->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionDoble_to_registro_pregunta4)
            }
        }
        binding.pregunta3Siete.setOnClickListener {
            if (imagenesIndex < 2) {
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
                        respuestacorrecta3=7
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_siete)
                        contadorClick += 1
                    }
                    3->{
                        respuestacorrecta4=7
                        binding.respuesta4.setImageResource(R.drawable.anara_pregunta_siete)
                        contadorClick += 1
                    }
                    4->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionDoble_to_registro_pregunta4)
            }
        }
        binding.pregunta3Ocho.setOnClickListener {
            if (imagenesIndex < 2) {
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
                        respuestacorrecta3=8
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_ocho)
                        contadorClick += 1
                    }
                    3->{
                        respuestacorrecta4=8
                        binding.respuesta4.setImageResource(R.drawable.anara_pregunta_ocho)
                        contadorClick += 1
                    }
                    4->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionDoble_to_registro_pregunta4)
            }
        }
        binding.pregunta3Nueve.setOnClickListener {
            if (imagenesIndex < 2) {
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
                        respuestacorrecta3=9
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_nueve)
                        contadorClick += 1
                    }
                    3->{
                        respuestacorrecta4=9
                        binding.respuesta4.setImageResource(R.drawable.anara_pregunta_nueve)
                        contadorClick += 1
                    }
                    4->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionDoble_to_registro_pregunta4)
            }
        }

        //RESPUESTA PREGUNTA 4
        if(respuestacorrecta1==1 && respuestacorrecta2==1 && respuestacorrecta3==0 && respuestacorrecta4==0){
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
            2 -> pregunta3()
            3 -> pregunta4()
        }
    }

    private fun pregunta1() {
        //contadorClick = 0
        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta3.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta_4.setImageResource(R.drawable.anara_signo_interrogacion)

        respuesta1.setImageResource(R.drawable.verde_pregunta_seis)
        imageView63.setImageResource(R.drawable.verde_pregunta_cero)
        imageView66.setImageResource(R.drawable.ama_pregunta_uno)
        respuesta2.setImageResource(R.drawable.ama_pregunta_ocho)
        //RESPUESTA DEFAULT
        if (respuestacorrecta1==1 && respuestacorrecta2==1 && respuestacorrecta3==5 && respuestacorrecta4==2){
            Correctas.numeroCorrectasNivelAlto+=1
        }else{
            Incorrectas.numeroIncorrectasNivelAlto+=1
        }
    }
    private fun pregunta2() {
        //contadorClick = 0
        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta3.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta_4.setImageResource(R.drawable.anara_signo_interrogacion)

        respuesta1.setImageResource(R.drawable.verde_pregunta_siete)
        imageView63.setImageResource(R.drawable.verde_pregunta_dos)
        imageView66.setImageResource(R.drawable.ama_pregunta_tres)
        respuesta2.setImageResource(R.drawable.ama_pregunta_cero)
        //RESPUESTA PREGUNTA 1
        if (respuestacorrecta1==1 && respuestacorrecta2==0 && respuestacorrecta3==8 && respuestacorrecta4==0){
            Correctas.numeroCorrectasNivelAlto+=1
        }else{
            Incorrectas.numeroIncorrectasNivelAlto+=1
        }
    }
    private fun pregunta3() {
        //contadorClick = 0
        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta3.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta_4.setImageResource(R.drawable.anara_signo_interrogacion)

        respuesta1.setImageResource(R.drawable.verde_pregunta_ocho)
        imageView63.setImageResource(R.drawable.verde_pregunta_uno)
        imageView66.setImageResource(R.drawable.ama_pregunta_tres)
        respuesta2.setImageResource(R.drawable.ama_pregunta_tres)
        //RESPUESTA PREGUNTA 2
        if (respuestacorrecta1==2 && respuestacorrecta2==1 && respuestacorrecta3==6 && respuestacorrecta4==0){
            Correctas.numeroCorrectasNivelAlto+=1
        }else{
            Incorrectas.numeroIncorrectasNivelAlto+=1
        }
    }
    private fun pregunta4() {
        //contadorClick = 0
        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta3.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta_4.setImageResource(R.drawable.anara_signo_interrogacion)

        respuesta1.setImageResource(R.drawable.verde_pregunta_cinco)
        imageView63.setImageResource(R.drawable.verde_pregunta_cinco)
        imageView66.setImageResource(R.drawable.ama_pregunta_dos)
        respuesta2.setImageResource(R.drawable.ama_pregunta_cero)
        //RESPUESTA PREGUNTA 3
        if (respuestacorrecta1==2 && respuestacorrecta2==6 && respuestacorrecta3==7 && respuestacorrecta4==3){
            Correctas.numeroCorrectasNivelAlto+=1
        }else{
            Incorrectas.numeroIncorrectasNivelAlto+=1
        }
    }


}
