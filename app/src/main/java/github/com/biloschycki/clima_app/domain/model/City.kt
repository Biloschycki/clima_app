package github.com.biloschycki.clima_app.domain.model

data class City(
    val id: Long,
    val name: String,
    val country: String,
    val latitude: Double,
    val longitude: Double,
    val lastTemperature: Double? = null,
    val region: String? = null
)
