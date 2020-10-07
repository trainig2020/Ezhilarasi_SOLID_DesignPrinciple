package com.ezhil;

public class Car {
	private String carName;
	private String model;
	
	
	public Car(String carName, String model) {
		super();
		this.carName = carName;
		this.model = model;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", model=" + model + "]";
	}
	
	

}
