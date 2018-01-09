package com.weather.repository;

import com.weather.entity.Weather;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WeatherRepositoryImpl implements WeatherRepository {

    public List<Weather> getAllReadings() {
        return null;
    }
}
