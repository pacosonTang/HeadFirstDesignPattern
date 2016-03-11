package com.designpattern.chapter1;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	// 设置测量值，并通知观察者.
	public void setMeasurements(float temp, float humidity, 
			float pressure)	{
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	// 当从气象站得到更新观测值时，我们通知观察者.
	public void measurementsChanged(){
		notifyObservers();
	}
	
	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}
	}
}
	
/*
public class WeatherData {
	Display currentDisplay;
	Display statisticsDisplay;
	Display forecastDisplay;
	
	public void measurementsChanged() {
		double temp = getTemperature();
		double humidity = getHumidity();
		double pressure = getPressure();
		
		*//**
		 * 以下3行代码的具体实现就是一个loser的实现：
		 * 针对具体实现编程，会导致以后在增加或删除布告板时必须修改程序
		 *//*
		currentDisplay.update(temp, humidity, pressure);
		statisticsDisplay.update(temp, humidity, pressure);
		forecastDisplay.update(temp, humidity, pressure);
	}
	public double getTemperature(){
		return 1.0;
	}
	
	public double getHumidity(){
		return 1.0;
	}
	public double getPressure(){
		return 1.0;
	}
}*/
