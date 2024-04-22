package com.example.sli.Data.Data

import com.example.sli.R


object providerMenu {
    val datos = listOf(
        datosMenu(
        nombre = "Inventario",
        imagen = R.drawable.inventario,
            accion = 0
    ),
        datosMenu(
            nombre = "Agregar Inventario",
            imagen = R.drawable.agregar,
            accion =R.id.action_menuFragment_to_addInventoryFragment
        ),
        datosMenu(
            nombre = "Proximamente",
            imagen = R.drawable.construccion,
            accion = 0
        )
    )
}