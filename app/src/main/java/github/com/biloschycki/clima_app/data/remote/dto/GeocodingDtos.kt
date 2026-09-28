package github.com.biloschycki.clima_app.data.remote.dto

data class GeocodingResponseDto(
    val results: List<GeocodingResultDto>?
)

data class GeocodingResultDto(
    val id: Long,
    val name: String,
    val country: String,
    val latitude: Double,
    val longitude: Double
)
