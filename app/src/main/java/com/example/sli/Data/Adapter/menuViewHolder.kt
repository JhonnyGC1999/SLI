package com.example.sli.Data.Adapter

import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.sli.Data.Data.datosMenu
import com.example.sli.databinding.ItemActivitysBinding

class menuViewHolder (val binding: ItemActivitysBinding): RecyclerView.ViewHolder(binding.root) {
    fun render(menu: datosMenu){
        binding.tvNombreDeActividad.text = menu.nombre
        binding.ivImagenDeActividad.setImageResource(menu.imagen)
        binding.clActividad.setOnClickListener {
            if (menu.accion != 0)
                binding.root.findNavController().navigate(menu.accion)
            else
                Toast.makeText(binding.root.context, "Proximamente :(", Toast.LENGTH_SHORT).show()
        }
    }
}