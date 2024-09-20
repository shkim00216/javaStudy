package javaStudy.part15.exam06;

public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		
		//b에 대하여 동기화 블럭 설정
		synchronized (b) {
			try {
				//b.wait(); 메서드 호출
				//메인쓰레드 정지
				//ThreadB가 5번 값을 더한 후 notify를 호출하게 되면 wait에서 깨어남
				System.out.println("b가 완료될 때까지 기다립니다.");
				b.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("Total is: " + b.total);
		}
	}
}
