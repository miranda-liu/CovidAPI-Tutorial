package com.example.apitutorial.services

import com.example.apitutorial.models.MyCountry
import retrofit2.Call
import retrofit2.http.GET

// has the function that gels all countries into a list using a Call function from retrofit
interface CountryService {

    @GET("countries")
    fun getAffectedCountryList () : Call<List<MyCountry>>
}