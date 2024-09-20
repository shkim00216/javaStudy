package javaStudy.part15.exam04;

public class MusicPlayer extends Thread {
	int type;
	MusicBox musicBox;
	
	//생성자 초기화
	public MusicPlayer(int type, MusicBox musicBox) {
		this.type = type;
		this.musicBox = musicBox;
	}

	//타입에 따라 다른 메서드 호출
	@Override
	public void run() {
		switch(type) {
			case 1: musicBox.playMusicA(); break;
			case 2: musicBox.playMusicB(); break;
			case 3: musicBox.playMusicC(); break;
		}
	}
}
