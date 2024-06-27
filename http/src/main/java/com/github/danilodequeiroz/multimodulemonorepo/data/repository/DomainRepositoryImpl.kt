package com.github.danilodequeiroz.multimodulemonorepo.data.repository

import com.github.danilodequeiroz.multimodulemonorepo.data.network.RestApiClient
import com.github.danilodequeiroz.multimodulemonorepo.domain.interfaces.repository.DomainRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

internal class DomainRepositoryImpl(val restApiClient: RestApiClient) : DomainRepository {

    override fun getTrendingAudios(countryCode: String): Flow<List<String>> {
        return flow {
            emit(restApiClient.getAudiosPathByCountryCode(countryCode))
        }
    }

}