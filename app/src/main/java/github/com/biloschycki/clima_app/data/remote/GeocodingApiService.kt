package github.com.biloschycki.clima_app.data.remote

import github.com.biloschycki.clima_app.data.remote.dto.GeocodingResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface GeocodingApiService {
    @GET("v1/search")
    suspend fun searchCity(@Query("name") name: String): GeocodingResponseDto
}
