package com.github.danilodequeiroz.multimodulemonorepo.data.network

internal interface RestApiClient {
    suspend fun getAudiosPathByCountryCode(countryCode: String): List<String>
}