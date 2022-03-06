package com;

import com.xworkz.oops.encapsulation.Car;

public class CarTester {
	public static void main(String []args)
	{
		Car car=new Car();
		
		car.setName("Fortuner");
		System.out.println(car.getName());
		
		car.setBrand("TOYOTA");
		System.out.println(car.getBrand());
		
		car.setEngine("Turbo");
		System.out.println(car.getEngine());
	
		car.setFuel(32.20);
		System.out.println(car.getFuel());
		
		car.setGear(5);
		System.out.println(car.getGear());
		
		car.setHeight(14.5);
		System.out.println(car.getHeight());
		
		car.setHorse(28);
		System.out.println(car.getHorse());
		
		car.setPrice(187218792);
		System.out.println(car.getPrice());
		
		car.setColor("black");
		System.out.println(car.getColor());

		car.setWeight("250Kg");
		System.out.println(car.getWeight());
	}

}
