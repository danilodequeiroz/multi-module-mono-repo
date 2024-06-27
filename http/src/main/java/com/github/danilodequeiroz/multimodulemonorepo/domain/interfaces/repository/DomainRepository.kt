package com.github.danilodequeiroz.multimodulemonorepo.domain.interfaces.repository

import kotlinx.coroutines.flow.Flow

interface DomainRepository {
    fun getTrendingAudios(countryCode: String): Flow<List<String>>
}