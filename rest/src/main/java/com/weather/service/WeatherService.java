package com.weather.service;

import com.weather.entity.Weather;

import java.util.List;

public interface WeatherService {
    List<Weather> getAllReadings();
}
