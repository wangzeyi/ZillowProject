package com.example.wang_.zillowproject.model

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wang_.zillowproject.R
import kotlinx.android.synthetic.main.property_item_layout.view.*

class MyPropertyAdapter: RecyclerView.Adapter<MyPropertyAdapter.MyViewHolder>(), BindableAdapter<MyProperty>{

    var mylist = emptyList<MyProperty>()

    override fun updateList(newList: List<MyProperty>){
        mylist = newList
        notifyDataSetChanged()
        //Log.d("MyTag","List Changed")
    }

    override fun idxChanged(idx: Int){
        notifyItemChanged(idx)
        //Log.d("MyTag","idx Changed")
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.property_item_layout, parent, false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return mylist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var property = mylist.get(position)
        holder.bind(property)
    }


    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(myProperty: MyProperty){
            itemView.textView_id.text = myProperty.id
            itemView.textView_address.text = myProperty.add
        }

    }

}