package com.designpattern.chapter1;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherDataJavaBuilt extends Observable{
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherDataJavaBuilt() {}
	
	// 设置测量值，并通知观察者.
	public void setMeasurements(float temp, float humidity, 
			float pressure)	{
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	// 在调用 notifyObservers() 之前，要先调用 setChanged() 来指示状态已经改变.
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
	
	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
