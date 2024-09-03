package javaStudy.part08.exam01;

public interface TV { //인터페이스 자체가 구현은 없고, 이러한 기능이 있다만 정의해줌
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 100; //상수 -> final 키워드 없이 사용 가능
	
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
