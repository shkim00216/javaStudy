package javaStudy.part08.exam02;

public class LedTV implements TV { //tv라는 인터페이스가 가진 기능을 LedTV가 구현하겠다

	@Override
	public void turnOn() {
		System.out.println("켜다");
	}

	@Override
	public void turnOff() {
		System.out.println("끄다");
	}

	@Override
	public void changeVolume(int volume) {
		System.out.println(volume + "로 볼륨조정하다");
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println(channel + "로 채널조정하다");
	}

}
