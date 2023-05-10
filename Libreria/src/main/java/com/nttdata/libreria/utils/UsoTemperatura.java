package com.nttdata.libreria.utils;


public class UsoTemperatura {
	
	public UsoTemperatura() {
		
	}
	
	public double cambioTemperaturaCelciusToFarenheit(double grados){
		grados = grados * 9 / 5 + 32;
		return grados;
	}
	
	public double cambioTemperaturaFarenheitToCelcius(double grados){
		grados = (grados - 32) * 5 / 9;
		return grados;
	}
}
