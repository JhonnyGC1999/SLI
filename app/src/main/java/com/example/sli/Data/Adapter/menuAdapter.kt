package com.example.sli.Data.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sli.Data.Data.datosMenu
import com.example.sli.R
import com.example.sli.databinding.ItemActivitysBinding

class menuAdapter : RecyclerView.Adapter<menuViewHolder>(){
    private var menuList:List<datosMenu> = emptyList()

    fun setMenu(menu:List<datosMenu>){
        menuList = menu
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): menuViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate((R.layout.item_activitys), parent,false)
        val binding = ItemActivitysBinding.bind(view)
        return menuViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return menuList.size
    }

    override fun onBindViewHolder(holder: menuViewHolder, position: Int) {
        val menu = menuList[position]
        holder.render(menu)
    }
}