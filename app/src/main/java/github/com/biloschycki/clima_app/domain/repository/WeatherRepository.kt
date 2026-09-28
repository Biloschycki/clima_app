package github.com.biloschycki.clima_app.domain.repository

import github.com.biloschycki.clima_app.domain.model.City
import github.com.biloschycki.clima_app.domain.model.WeatherForecast
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    fun searchCity(query: String): Flow<Result<List<City>>>
    fun getForecast(city: City): Flow<Result<WeatherForecast>>
    fun getFavorites(): Flow<List<City>>
    suspend fun toggleFavorite(city: City): Boolean
    fun isFavorite(cityId: Long): Flow<Boolean>
}
