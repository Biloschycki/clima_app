package github.com.biloschycki.clima_app.data.remote.dto

import github.com.biloschycki.clima_app.domain.model.City
import github.com.biloschycki.clima_app.domain.model.WeatherForecast

fun GeocodingResultDto.toDomain(): City = City(
    id = id,
    name = name,
    country = country,
    latitude = latitude,
    longitude = longitude
)

fun ForecastResponseDto.toDomain(): WeatherForecast = WeatherForecast(
    currentTemperature = current.temperature,
    weatherCode = current.weatherCode,
    dailyMaxTemperatures = daily.maxTemperatures,
    dailyMinTemperatures = daily.minTemperatures
)
