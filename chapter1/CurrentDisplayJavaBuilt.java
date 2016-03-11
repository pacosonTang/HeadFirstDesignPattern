package com.designpattern.chapter1;

import java.util.Observable;
import java.util.Observer;

public class CurrentDisplayJavaBuilt implements Observer, 
											DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Observable observable;

	public CurrentDisplayJavaBuilt(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherDataJavaBuilt){
			WeatherDataJavaBuilt data = (WeatherDataJavaBuilt)o;
			this.temperature = data.getTemperature();
			this.humidity = data.getHumidity();
			this.pressure = data.getPressure();
			
			display();
		}
	}
	 
	@Override
	public void display() {
		System.out.println("current contions: temperature is " + temperature
				+ ", humidity is " + humidity + ", pressure is " + pressure);
	}
}
