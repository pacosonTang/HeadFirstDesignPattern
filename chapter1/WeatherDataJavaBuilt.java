package com.designpattern.chapter1;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherDataJavaBuilt extends Observable{
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherDataJavaBuilt() {}
	
	// ���ò���ֵ����֪ͨ�۲���.
	public void setMeasurements(float temp, float humidity, 
			float pressure)	{
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	// �ڵ��� notifyObservers() ֮ǰ��Ҫ�ȵ��� setChanged() ��ָʾ״̬�Ѿ��ı�.
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
