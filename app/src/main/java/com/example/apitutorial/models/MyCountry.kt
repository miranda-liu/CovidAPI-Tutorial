package com.example.apitutorial.models

data class MyCountry(
    val active: Int,
    val activePerOneMillion: Double,
    val cases: Int,
    val casesPerOneMillion: Double,
    val continent: String,
    val country: String,
    val countryInfo: CountryInfo,
    val critical: Int,
    val criticalPerOneMillion: Double,
    val deaths: Int,
    val deathsPerOneMillion: Double,
    val oneCasePerPeople: Int,
    val oneDeathPerPeople: Int,
    val oneTestPerPeople: Int,
    val population: Int,
    val recovered: Int,
    val recoveredPerOneMillion: Double,
    val tests: Int,
    val testsPerOneMillion: Double,
    val todayCases: Int,
    val todayDeaths: Int,
    val todayRecovered: Int,
    val updated: Long
) {
    data class CountryInfo(
        val _id: Int,
        val flag: String,
        val iso2: String,
        val iso3: String,
        val lat: Double,
        val long: Double
    )
}