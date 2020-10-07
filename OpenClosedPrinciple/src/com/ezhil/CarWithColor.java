package com.ezhil;

public class CarWithColor extends Car {

	private String color;

	public CarWithColor(String carName, String model, String color) {
		super(carName, model);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "CarWithColor [color=" + color + ", CarName=" + getCarName() + ", Model=" + getModel() + "]";
	}

	

	
	

	

	

}
