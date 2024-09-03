package javaStudy.part07.exam04;

public class Truck extends Car {
	public Truck() { //생성되기 전 반드시 부모 생성자가 먼저 생성되어야 함
//		super(); //자동으로 부모의 생성자 호출
		super("소방차"); //부모 생성자 임의 생성해줘야 함
		System.out.println("Truck의 기본 생성자입니다.");
	}
}
