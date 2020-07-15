package aplication.funmathhelper.pdmproyecto.nivel_intermedio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentMultiplicacionMediaBinding
import kotlinx.android.synthetic.main.fragment_multiplicacion_media.*

/**
 * A simple [Fragment] subclass.
 */
class MultiplicacionMedia : Fragment() {
    private var imagenesIndex = 0
    private var contadorClick = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentMultiplicacionMediaBinding>(inflater,R.layout.fragment_multiplicacion_media,container,false)
        binding.pregunta2Cero.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_cero)
                        contadorClick += 1
                    }
                    1->{
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_cero)
                        contadorClick += 1
                    }
                    2->{
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_cero)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionMedia_to_restaTriple)
            }
        }
        binding.pregunta3Uno.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_uno)
                        contadorClick += 1
                    }
                    1->{
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_uno)
                        contadorClick += 1
                    }
                    2->{
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_uno)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionMedia_to_restaTriple)
            }
        }
        binding.pregunta3Dos.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    1->{
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    2->{
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionMedia_to_restaTriple)
            }
        }
        binding.pregunta3Dos.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    1->{
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    2->{
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionMedia_to_restaTriple)
            }
        }
        binding.pregunta3Tres.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_tres)
                        contadorClick += 1
                    }
                    1->{
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_tres)
                        contadorClick += 1
                    }
                    2->{
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionMedia_to_restaTriple)
            }
        }
        binding.pregunta3Cuatro.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_cuatro)
                        contadorClick += 1
                    }
                    1->{
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_cuatro)
                        contadorClick += 1
                    }
                    2->{
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_cuatro)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionMedia_to_restaTriple)
            }
        }
        binding.pregunta3Cinco.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_cinco)
                        contadorClick += 1
                    }
                    1->{
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_cinco)
                        contadorClick += 1
                    }
                    2->{
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_cinco)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionMedia_to_restaTriple)
            }
        }
        binding.pregunta3Seis.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_seis)
                        contadorClick += 1
                    }
                    1->{
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_seis)
                        contadorClick += 1
                    }
                    2->{
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_seis)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionMedia_to_restaTriple)
            }
        }
        binding.pregunta3Siete.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_siete)
                        contadorClick += 1
                    }
                    1->{
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_siete)
                        contadorClick += 1
                    }
                    2->{
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_seis)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionMedia_to_restaTriple)
            }
        }
        binding.pregunta3Ocho.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_ocho)
                        contadorClick += 1
                    }
                    1->{
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_ocho)
                        contadorClick += 1
                    }
                    2->{
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_ocho)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionMedia_to_restaTriple)
            }
        }
        binding.pregunta3Nueve.setOnClickListener {
            if (imagenesIndex < 5) {
                when(contadorClick){
                    0->{
                        binding.solucion1.setImageResource(R.drawable.anara_pregunta_nueve)
                        contadorClick += 1
                    }
                    1->{
                        binding.solucion2.setImageResource(R.drawable.anara_pregunta_nueve)
                        contadorClick += 1
                    }
                    2->{
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_nueve)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex += 1
                    }
                }
            } else {
                it.findNavController().navigate(R.id.action_multiplicacionMedia_to_restaTriple)
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
        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta3.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta1.setImageResource(R.drawable.verde_pregunta_uno)
        imageView63.setImageResource(R.drawable.verde_pregunta_seis)
        respuesta2.setImageResource(R.drawable.ama_pregunta_nueve)
    }
    private fun pregunta2() {
        //contadorClick = 0
        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta3.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta1.setImageResource(R.drawable.verde_pregunta_cinco)
        imageView63.setImageResource(R.drawable.verde_pregunta_cinco)
        respuesta2.setImageResource(R.drawable.ama_pregunta_siete)
    }
    private fun pregunta3() {
        //contadorClick = 0
        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta3.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta1.setImageResource(R.drawable.verde_pregunta_ocho)
        imageView63.setImageResource(R.drawable.verde_pregunta_dos)
        respuesta2.setImageResource(R.drawable.ama_pregunta_nueve)
    }
    private fun pregunta4() {
        //contadorClick = 0
        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta3.setImageResource(R.drawable.anara_signo_interrogacion)

        respuesta1.setImageResource(R.drawable.verde_pregunta_seis)
        imageView63.setImageResource(R.drawable.verde_pregunta_dos)
        respuesta2.setImageResource(R.drawable.ama_pregunta_tres)
    }
}
