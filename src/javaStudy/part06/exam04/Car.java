
package javaStudy.part06.exam04;

public class Car {
	//타입 필드명
	String name;
	int number;
	
	public Car() {
//		this.name = "이름없음";
//		this.number = 0;
		this("이름없음", 0);
	 } //기본 생성자
	
	public Car(String name) {
		this.name = name;
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
}
