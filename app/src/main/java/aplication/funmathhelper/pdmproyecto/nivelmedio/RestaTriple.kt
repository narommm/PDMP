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
import com.example.pdmproyecto.databinding.FragmentRestaTripleBinding
import kotlinx.android.synthetic.main.fragment_resta_triple.*

/**
 * A simple [Fragment] subclass.
 */
class RestaTriple : Fragment() {

    private var imagenesIndex = 0
    private var contadorClick = 0
    private var respuestacorrecta1 = 0
    private var respuestacorrecta2 = 0
    private var respuestacorrecta3 = 0
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
                        respuestacorrecta1=0
                        binding.respuesta1.setImageResource(R.drawable.verde_pregunta_cero)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=0
                        binding.respuesta2.setImageResource(R.drawable.ama_pregunta_cero)
                        contadorClick += 1
                    }
                    2->{
                        respuestacorrecta3=0
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_cero)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_restaTriple_to_registro_pregunta2)
            }
        }
        binding.pregunta3Uno.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=1
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_uno)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=1
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_uno)
                        contadorClick += 1
                    }
                    2->{
                        respuestacorrecta3=1
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_uno)
                        contadorClick += 1

                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_restaTriple_to_registro_pregunta2)
            }
        }
        binding.pregunta3Dos.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=2
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=2
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    2->{
                        respuestacorrecta3=2
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_restaTriple_to_registro_pregunta2)
            }
        }
        binding.pregunta3Tres.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=3
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_tres)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=3
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_tres)
                        contadorClick += 1
                    }
                    2->{
                        respuestacorrecta3=3
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_tres)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_restaTriple_to_registro_pregunta2)
            }
        }
        binding.pregunta3Cuatro.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=4
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_cuatro)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=4
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_cuatro)
                        contadorClick += 1
                    }
                    2->{
                        respuestacorrecta3=4
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_cuatro)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_restaTriple_to_registro_pregunta2)
            }
        }
        binding.pregunta3Cinco.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=5
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_cinco)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=5
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_cinco)
                        contadorClick += 1
                    }
                    2->{
                        respuestacorrecta3=5
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_cinco)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_restaTriple_to_registro_pregunta2)
            }
        }
        binding.pregunta3Seis.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=6
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_seis)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=6
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_seis)
                        contadorClick += 1
                    }
                    2->{
                        respuestacorrecta3=6
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_seis)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_restaTriple_to_registro_pregunta2)
            }
        }
        binding.pregunta3Siete.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=7
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_siete)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=7
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_siete)
                        contadorClick += 1
                    }
                    2->{
                        respuestacorrecta3=7
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_siete)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_restaTriple_to_registro_pregunta2)
            }
        }
        binding.pregunta3Ocho.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=8
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_ocho)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=8
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_ocho)
                        contadorClick += 1
                    }
                    2->{
                        respuestacorrecta3=8
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_ocho)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_restaTriple_to_registro_pregunta2)
            }
        }
        binding.pregunta3Nueve.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        respuestacorrecta1=9
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_nueve)
                        contadorClick += 1
                    }
                    1->{
                        respuestacorrecta2=9
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_nueve)
                        contadorClick += 1
                    }
                    2->{
                        respuestacorrecta3=9
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_nueve)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_restaTriple_to_registro_pregunta2)
            }
        }
        //RESPUESTA PREGUNTA 4
        if(respuestacorrecta1==3 && respuestacorrecta2==1 && respuestacorrecta3==9){
            Correctas.numeroCorrectasNivelMedio+=1
        }else{
            Incorrectas.numeroIncorrectasNivelMedio+=1
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
        respuesta1.setImageResource(R.drawable.verde_pregunta_signo_interrogacion)
        respuesta2.setImageResource(R.drawable.ama_signo_interrogacion)
        respuesta3.setImageResource(R.drawable.anara_signo_interrogacion)

        imageView56.setImageResource(R.drawable.verde_pregunta_cinco)
        imageView54.setImageResource(R.drawable.verde_pregunta_cero)
        imageView58.setImageResource(R.drawable.ama_pregunta_cuatro)
        imageView60.setImageResource(R.drawable.ama_pregunta_cero)
        solucion1.setImageResource(R.drawable.anara_pregunta_dos)
        solucion2.setImageResource(R.drawable.anara_pregunta_cinco)
        //RESPUESTA PREGUNTA DEFAULT
        if(respuestacorrecta1==5 && respuestacorrecta2==2 && respuestacorrecta3==1){
            Correctas.numeroCorrectasNivelMedio+=1
        }else{
            Incorrectas.numeroIncorrectasNivelMedio+=1
        }
    }

    private fun pregunta2() {
        //contadorClick = 0
        respuesta1.setImageResource(R.drawable.verde_pregunta_signo_interrogacion)
        respuesta2.setImageResource(R.drawable.ama_signo_interrogacion)
        respuesta3.setImageResource(R.drawable.anara_signo_interrogacion)

        imageView56.setImageResource(R.drawable.verde_pregunta_ocho)
        imageView54.setImageResource(R.drawable.verde_pregunta_uno)
        imageView58.setImageResource(R.drawable.ama_pregunta_dos)
        imageView60.setImageResource(R.drawable.ama_pregunta_cinco)
        solucion1.setImageResource(R.drawable.anara_pregunta_dos)
        solucion2.setImageResource(R.drawable.anara_pregunta_cero)
        //RESPUESTA PREGUNTA 1
        if(respuestacorrecta1==6 && respuestacorrecta2==0 && respuestacorrecta3==0){
            Correctas.numeroCorrectasNivelMedio+=1
        }else{
            Incorrectas.numeroIncorrectasNivelMedio+=1
        }
    }

    private fun pregunta3() {
        //contadorClick = 0
        respuesta1.setImageResource(R.drawable.verde_pregunta_signo_interrogacion)
        respuesta2.setImageResource(R.drawable.ama_signo_interrogacion)
        respuesta3.setImageResource(R.drawable.anara_signo_interrogacion)

        imageView56.setImageResource(R.drawable.verde_pregunta_cinco)
        imageView54.setImageResource(R.drawable.verde_pregunta_cinco)
        imageView58.setImageResource(R.drawable.ama_pregunta_seis)
        imageView60.setImageResource(R.drawable.ama_pregunta_ocho)
        solucion1.setImageResource(R.drawable.anara_pregunta_cero)
        solucion2.setImageResource(R.drawable.anara_pregunta_cinco)
        //RESPUESTA PREGUNTA 2
        if(respuestacorrecta1==4 && respuestacorrecta2==7 && respuestacorrecta3==6){
            Correctas.numeroCorrectasNivelMedio+=1
        }else{
            Incorrectas.numeroIncorrectasNivelMedio+=1
        }
    }

    private fun pregunta4() {
        //contadorClick = 0
        respuesta1.setImageResource(R.drawable.verde_pregunta_signo_interrogacion)
        respuesta2.setImageResource(R.drawable.ama_signo_interrogacion)
        respuesta3.setImageResource(R.drawable.anara_signo_interrogacion)

        imageView56.setImageResource(R.drawable.verde_pregunta_dos)
        imageView54.setImageResource(R.drawable.verde_pregunta_dos)
        imageView58.setImageResource(R.drawable.ama_pregunta_dos)
        imageView60.setImageResource(R.drawable.ama_pregunta_tres)
        solucion1.setImageResource(R.drawable.anara_pregunta_uno)
        solucion2.setImageResource(R.drawable.anara_pregunta_cero)
        //RESPUESTA PREGUNTA 3
        if(respuestacorrecta1==7 && respuestacorrecta2==9 && respuestacorrecta3==7){
            Correctas.numeroCorrectasNivelMedio+=1
        }else{
            Incorrectas.numeroIncorrectasNivelMedio+=1
        }
    }

}
