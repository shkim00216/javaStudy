package javaStudy.part15.exam04;

public class MusicBox {
	//3개의 메서드 가지고 있음
	public synchronized void playMusicA() {
		for (int i=0; i<10; i++) {
			System.out.println("신나는 음악!!!");
			
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} //메서드 하나가 모두 실행된 후에 다음 메서드 실행(모니터링 락 - 메서드 종료나 wait() 만나기 전까지 유지)
	
	public synchronized void playMusicB() {
		for (int i=0; i<10; i++) {
			System.out.println("슬픈 음악!!!");
			
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void playMusicC() {
		for (int i=0; i<10; i++) {
			synchronized(this) {
				System.out.println("카페 음악!!!");
			}
			
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
