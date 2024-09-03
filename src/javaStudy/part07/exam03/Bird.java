package javaStudy.part07.exam03;

public abstract class Bird {
	public abstract void sing();
	//하나라도 추상 메소드가 되면 추상 클래스가 될 수 밖에 없음
	
	public void fly() {
		System.out.println("날다.");
	} 
}
