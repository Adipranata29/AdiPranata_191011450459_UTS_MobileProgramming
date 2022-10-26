package com.example.aplikasilistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class PulauIndonesia(var mContext: Context, var resources: Int, var items:List<Indonesia>): ArrayAdapter<Indonesia>(mContext, resources, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater=LayoutInflater.from(mContext)
        val view:View = layoutInflater.inflate(resources, null)

        val imageView:ImageView = view.findViewById(R.id.photo)
        val PulauIndonesia:TextView = view.findViewById(R.id.tvPulau)
        val Deskripsi:TextView = view.findViewById(R.id.tvDeskripsi)

        var mItem:Indonesia = items[position]
        imageView.setImageDrawable(mContext.resources.getDrawable(mItem.photo))
        PulauIndonesia.text = mItem.kucing
        Deskripsi.text = mItem.deskripsi
        return view
    }
}