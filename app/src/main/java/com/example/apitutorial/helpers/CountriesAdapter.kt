package com.example.apitutorial.helpers

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apitutorial.R
import com.example.apitutorial.models.MyCountry
import com.squareup.picasso.Picasso

class CountriesAdapter (private val countriesList: List<MyCountry>) :RecyclerView.Adapter<CountriesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view  = LayoutInflater.from(parent.context).inflate(R.layout.country_item,parent,false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int {

        return countriesList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("Response", "List Count :${countriesList.size} ")


        return holder.bind(countriesList[position])

    }
    class ViewHolder(itemView : View) :RecyclerView.ViewHolder(itemView) {


        var imageView = itemView.findViewById<ImageView>(R.id.ivFlag)
        var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        var tvCases = itemView.findViewById<TextView>(R.id.tvCases)
        // binds the data to the respective elements and loads the image using picasso
        fun bind(country: MyCountry) {

            val name = "Cases :${country.cases.toString()}"
            tvTitle.text = country.country
            tvCases.text = name
            Picasso.get().load(country.countryInfo.flag).into(imageView)
        }
    }
}