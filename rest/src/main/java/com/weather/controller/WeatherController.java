package com.weather.controller;


import com.weather.entity.Weather;
import com.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://mocker.egen.io")
@RestController
@RequestMapping(value = "/readings")
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Weather> getAllReadings() {
        return weatherService.getAllReadings();
    }
}