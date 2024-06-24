package com.moraga.ejemplomenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.moraga.ejemplomenu.databinding.FragmentSumaBinding


class Suma : Fragment() {

    lateinit var binding: FragmentSumaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSumaBinding.inflate(layoutInflater)
        start()
        // Inflate the layout for this fragment
        return binding.root
    }

    public fun start() {
        binding.BtnSuma.setOnClickListener {
            try {
                val num1:Int = binding.TfNum1.editText?.text.toString().toInt()
                val num2:Int = binding.TfNum2.editText?.text.toString().toInt()
                val resultado: Int = suma(num1, num2)
                binding.TvResultado.text = resultado.toString()
            } catch (a: NumberFormatException){
                binding.TvResultado.text = "Por favor rellene los dos campos con numeros validos"
            }

        }

    }

    private fun suma(num1: Int, num2: Int): Int {
        return num1 + num2
    }

}
