package javaStudy.part07.exam05;

public class Bus extends Car {
	public void run() {
		super.run(); //부모가 가진 메소드 실행
		System.out.println("Bus의 run 메소드");
	}
}
