package com.weather.service;

import com.weather.entity.Weather;
import com.weather.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    WeatherRepository weatherRepository;

    public List<Weather> getAllReadings() {
        return weatherRepository.getAllReadings();
    }
}
