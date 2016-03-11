package com.designpattern.chapter1;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		CurrentDisplay display = new CurrentDisplay(data);
		
		data.setMeasurements(1, 23, 30.4f);
	}
}
