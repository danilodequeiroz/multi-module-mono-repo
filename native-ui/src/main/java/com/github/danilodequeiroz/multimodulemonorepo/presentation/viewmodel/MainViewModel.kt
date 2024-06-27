package com.github.danilodequeiroz.multimodulemonorepo.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.danilodequeiroz.multimodulemonorepo.domain.usecase.GetTrendingAudiosByCountryCode
import com.github.danilodequeiroz.multimodulemonorepo.useCaseGetTrendingAudiosByCountryCode
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val domainRepository: GetTrendingAudiosByCountryCode by lazy { useCaseGetTrendingAudiosByCountryCode }

    private val _trendingAudios = MutableStateFlow<List<String>>(emptyList())

    val trendingAudios: StateFlow<List<String>> = _trendingAudios.asStateFlow()

    init {
        viewModelScope.launch {
            domainRepository.invoke("pt-BR")
                .collect { audios ->
                    _trendingAudios.value = audios
                }
        }
    }
}