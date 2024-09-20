package javaStudy.part16.exam03;

public class Car {
	String name;
	int capacity;
	int price;
	int age;
	
	public Car(String name, int capacity, int price, int age) {
		this.name = name;
		this.capacity = capacity;
		this.price = price;
		this.age = age;
	}
	
	public String toString() {
		return name;
	}
}
