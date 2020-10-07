package com.ezhil;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("Benz", "A-Class");
		CarWithColor color = new CarWithColor(car.getCarName(), car.getModel(), "Gray");
		System.out.println(color);

	}

}
