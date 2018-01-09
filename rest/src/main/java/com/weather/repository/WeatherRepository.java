package com.weather.repository;

import com.weather.entity.Weather;

import java.util.List;

public interface WeatherRepository {
    List<Weather> getAllReadings();
}
