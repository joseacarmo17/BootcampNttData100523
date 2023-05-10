package com.nttdata.reto1.service;


import org.springframework.stereotype.Service;

import com.nttdata.libreria.utils.UsoTemperatura;

@Service
public class TemperaturaService {
	UsoTemperatura usoTemperatura = new UsoTemperatura();
	
	public double celciusToFarenheit(double grados) {
		return usoTemperatura.cambioTemperaturaCelciusToFarenheit(grados);
	}
	
	public double farenheitToCelcius(double grados) {
		return usoTemperatura.cambioTemperaturaFarenheitToCelcius(grados);
	}
}
