package com.example.pdmproyecto.nivelbajo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentRestaSimpleBinding

/**
 * A simple [Fragment] subclass.
 */
class resta_simple : Fragment() {


    data class BotonView(
        val imagenes: List<Int>
    )

    private val botonView: MutableList<BotonView> = mutableListOf(
        BotonView(
            imagenes = listOf(
                (R.drawable.verde_num_dos),
                R.drawable.verde_num_siete,
                R.drawable.ama_pregunta_uno,
                R.drawable.ama_pregunta_seis
            )
        ),
        BotonView(
            imagenes = listOf(
                (R.drawable.verde_num_tres),
                R.drawable.verde_num_uno,
                R.drawable.ama_pregunta_seis,
                R.drawable.ama_pregunta_siete
            )
        ),
        BotonView(
            imagenes = listOf(
                (R.drawable.verde_num_cinco),
                R.drawable.verde_num_tres,
                R.drawable.ama_pregunta_cuatro,
                R.drawable.ama_pregunta_seis
            )
        )
    )

    lateinit var imagenes: MutableList<Int>
    private var imagenesIndex = 0
    private var contadorClick = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentRestaSimpleBinding>(inflater, R.layout.fragment_resta_simple, container, false)

        binding.pregunta3Uno.setOnClickListener {
            if(imagenesIndex!=3){
                if(contadorClick<2){
                    if(contadorClick==0){
                        contadorClick=+1
                        binding.respuesta1.setImageResource(R.drawable.anara_pregunta_uno)
                    }else{
                        contadorClick=1
                        binding.respuesta2.setImageResource(R.drawable.anara_pregunta_uno)
                    }
                }else{
                    imagenesIndex=+1
                    imagenes[imagenesIndex]
                    contadorClick=0
                }
            }else{
                it.findNavController().navigate(R.id.action_nivel_bajo_pregunta_3_to_suma_simple)
            }
        }

        return binding.root
    }


}


