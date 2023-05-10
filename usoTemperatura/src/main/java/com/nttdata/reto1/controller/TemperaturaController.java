package com.nttdata.reto1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.reto1.service.TemperaturaService;

@RestController
@RequestMapping("/temperatura")
public class TemperaturaController {
	@Autowired
	TemperaturaService temperaturaService;
    @GetMapping("/fahrenheit-to-celsius/{fahrenheit}")
    public double convertFahrenheitToCelsius(@PathVariable double fahrenheit) {
        return temperaturaService.farenheitToCelcius(fahrenheit);
    }

    @GetMapping("/celsius-to-fahrenheit/{celsius}")
    public double convertCelsiusToFahrenheit(@PathVariable double celsius) {
    	return temperaturaService.celciusToFarenheit(celsius);
    }
}





