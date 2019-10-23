package ru.druliks.top100currencies.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<VH:BaseAdapter.BaseViewHolder> : RecyclerView.Adapter<VH>() {

    var items:ArrayList<Any> = ArrayList()

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(getItem(position))
    }

    fun getItem(postition:Int):Any{
        return items[postition]
    }

    fun add(newItem:Any){
        items.add(newItem)
    }

    fun add(newItems:List<Any>){
        items.addAll(newItems)
    }

    abstract class BaseViewHolder(protected val view: View) : RecyclerView.ViewHolder(view){
        abstract fun bind(item:Any)
    }
}