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
	
	// ���ò���ֵ����֪ͨ�۲���.
	public void setMeasurements(float temp, float humidity, 
			float pressure)	{
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	// ��������վ�õ����¹۲�ֵʱ������֪ͨ�۲���.
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
		 * ����3�д���ľ���ʵ�־���һ��loser��ʵ�֣�
		 * ��Ծ���ʵ�ֱ�̣��ᵼ���Ժ������ӻ�ɾ�������ʱ�����޸ĳ���
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
