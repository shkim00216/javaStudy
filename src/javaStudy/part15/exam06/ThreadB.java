package javaStudy.part15.exam06;

public class ThreadB extends Thread {
	//해당 쓰레드가 실행되면 자기 자신의 모니터링 락 획득
	//5번 반복하면서 0.5초씩 쉬면서 total에 값 누적
	//그 후에 notify() 메서드 호출하여 wait하고 있는 쓰레드 깨움
	
	int total;
	
	public void run() {
		synchronized (this) {
			for (int i=0; i<5; i++) {
				System.out.println(i + "를 더합니다.");
				total += i;
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notify();
		}
	}
}
