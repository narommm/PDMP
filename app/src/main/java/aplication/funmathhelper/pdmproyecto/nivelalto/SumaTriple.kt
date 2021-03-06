package aplication.funmathhelper.pdmproyecto.nivelalto

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentSumaTripleBinding
import kotlinx.android.synthetic.main.fragment_suma_triple.*

class SumaTriple : Fragment(){
    private var imagenesIndex = 0
    private var contadorClick = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val binding = DataBindingUtil.inflate<FragmentSumaTripleBinding>(inflater,R.layout.fragment_suma_simple,container,false)

        binding.pregunta2Cero.setOnClickListener {
            if (imagenesIndex < 3) {
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
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_cero)
                        contadorClick +=1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
               // it.findNavController().navigate(R.id.action_sumaTriple_to_divisionSimple)
            }
        }
        binding.pregunta3Uno.setOnClickListener {
            if (imagenesIndex < 3) {
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
                       binding.respuesta3.setImageResource(R.drawable.anara_pregunta_uno)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
               // it.findNavController().navigate(R.id.action_sumaTriple_to_divisionSimple)
            }
        }
        binding.pregunta3Dos.setOnClickListener {
            if (imagenesIndex < 3) {
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
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_dos)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
               // it.findNavController().navigate(R.id.action_sumaTriple_to_divisionSimple)
            }
        }
        binding.pregunta3Tres.setOnClickListener {
            if (imagenesIndex < 3) {
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
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_tres)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
                //it.findNavController().navigate(R.id.action_sumaTriple_to_divisionSimple)
            }
        }
        binding.pregunta3Cuatro.setOnClickListener {
            if (imagenesIndex < 3) {
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
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_cuatro)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
               // it.findNavController().navigate(R.id.action_sumaTriple_to_divisionSimple)
            }
        }
        binding.pregunta3Cinco.setOnClickListener {
            if (imagenesIndex < 3) {
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
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_cinco)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
                //it.findNavController().navigate(R.id.action_sumaTriple_to_divisionSimple)
            }
        }
        binding.pregunta3Seis.setOnClickListener {
            if (imagenesIndex < 3) {
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
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_seis)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
               // it.findNavController().navigate(R.id.action_sumaTriple_to_divisionSimple)
            }
        }
        binding.pregunta3Siete.setOnClickListener {
            if (imagenesIndex < 3) {
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
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_siete)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
               // it.findNavController().navigate(R.id.action_sumaTriple_to_divisionSimple)
            }
        }
        binding.pregunta3Ocho.setOnClickListener {
            if (imagenesIndex < 3) {
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
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_ocho)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
                //it.findNavController().navigate(R.id.action_sumaTriple_to_divisionSimple)
            }
        }
        binding.pregunta3Nueve.setOnClickListener {
            if (imagenesIndex < 3) {
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
                        binding.respuesta3.setImageResource(R.drawable.anara_pregunta_nueve)
                        contadorClick += 1
                    }
                    3->{
                        cambioPregunta(imagenesIndex)
                        imagenesIndex +=1
                    }
                }
            } else {
                //it.findNavController().navigate(R.id.action_sumaTriple_to_divisionSimple)
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
        }
    }

    private fun pregunta1() {
        //contadorClick = 0
        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta3.setImageResource(R.drawable.anara_signo_interrogacion)

        respuesta1.setImageResource(R.drawable.verde_pregunta_tres)
        imageView56.setImageResource(R.drawable.verde_pregunta_cero)
        imageView54.setImageResource(R.drawable.verde_pregunta_cinco)
        imageView58.setImageResource(R.drawable.ama_pregunta_uno)
        respuesta2.setImageResource(R.drawable.ama_pregunta_seis)
        imageView60.setImageResource(R.drawable.ama_pregunta_dos)
    }

    private fun pregunta2() {
        //contadorClick = 0
        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta3.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta1.setImageResource(R.drawable.verde_pregunta_cinco)
        imageView56.setImageResource(R.drawable.verde_pregunta_seis)
        imageView54.setImageResource(R.drawable.verde_pregunta_cero)
        imageView58.setImageResource(R.drawable.ama_pregunta_uno)
        respuesta2.setImageResource(R.drawable.ama_pregunta_siete)
        imageView60.setImageResource(R.drawable.ama_pregunta_siete)
    }

    private fun pregunta3() {
        //contadorClick = 0
        solucion1.setImageResource(R.drawable.anara_signo_interrogacion)
        solucion2.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta3.setImageResource(R.drawable.anara_signo_interrogacion)
        respuesta1.setImageResource(R.drawable.verde_pregunta_dos)
        imageView56.setImageResource(R.drawable.verde_pregunta_tres)
        imageView54.setImageResource(R.drawable.verde_pregunta_uno)
        imageView58.setImageResource(R.drawable.ama_pregunta_siete)
        respuesta2.setImageResource(R.drawable.ama_pregunta_uno)
        imageView60.setImageResource(R.drawable.ama_pregunta_nueve)
    }

}