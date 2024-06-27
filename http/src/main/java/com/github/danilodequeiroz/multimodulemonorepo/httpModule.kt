package com.github.danilodequeiroz.multimodulemonorepo

import android.util.Log
import com.github.danilodequeiroz.multimodulemonorepo.data.network.RestApiClient
import com.github.danilodequeiroz.multimodulemonorepo.data.repository.DomainRepositoryImpl
import com.github.danilodequeiroz.multimodulemonorepo.domain.interfaces.repository.DomainRepository
import com.github.danilodequeiroz.multimodulemonorepo.domain.usecase.GetTrendingAudiosByCountryCode

private val getNewDomainRepository: DomainRepository by lazy {
    DomainRepositoryImpl(restApiClient = object : RestApiClient {
        override suspend fun getAudiosPathByCountryCode(countryCode: String): List<String> {
            return listOf(
                "Tome",
                "Cavalo",
                "Ele gosta",
                "Cheegggaa",
                "UUUIIII",
                "Dança gatinho dança",
                "Que isso meu filho, calma",
            ).also { countryCode.doNothing() }
        }
    })
}

val useCaseGetTrendingAudiosByCountryCode: GetTrendingAudiosByCountryCode by lazy {
    GetTrendingAudiosByCountryCode(getNewDomainRepository)
}

private fun String.doNothing() = Unit.also { Log.d("TAG", "doNothing: $this") }
