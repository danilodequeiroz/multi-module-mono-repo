package com.github.danilodequeiroz.multimodulemonorepo.domain.usecase

import com.github.danilodequeiroz.multimodulemonorepo.domain.interfaces.repository.DomainRepository
import kotlinx.coroutines.flow.Flow

class GetTrendingAudiosByCountryCode(private val repository: DomainRepository) {

    operator fun invoke(coutryCode: String): Flow<List<String>> {
        return repository.getTrendingAudios(coutryCode)
    }

}