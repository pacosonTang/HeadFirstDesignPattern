package com.designpattern.chapter1;

public class CurrentDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public CurrentDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	// ��update() ������ʱ�����ǰ��¶Ⱥ�ʪ�ȱ���������Ȼ�����display��
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("current contions: temperature is " + temperature
				+ ", humidity is " + humidity + ", pressure is " + pressure);
	}

}
