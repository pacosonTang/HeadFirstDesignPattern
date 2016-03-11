package com.designpattern.chapter1;

public class WeatherStationJavaBuilt {
	public static void main(String[] args) {
		WeatherDataJavaBuilt data = new WeatherDataJavaBuilt();
		CurrentDisplayJavaBuilt display = new CurrentDisplayJavaBuilt(data);
		
		data.setMeasurements(1f, 2f, 3f);
	}
}
