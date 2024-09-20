package javaStudy.part15.exam07;

public class DaemonThread implements Runnable {

	//무한루프 안에서 0.5초씩 쉬면서 데몬쓰레드가 실행중입니다를 출력하도록 run() 메서드 작성
	@Override
	public void run() {
		while(true) {
			System.out.println("데몬 쓰레드가 실행중입니다.");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break; //Exception 발생 시 while문 빠져나오기
			}
		}
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new DaemonThread());
		thread.setDaemon(true); //데몬쓰레드 설정
		thread.start();
		
		//메인 쓰레드가 0.5초 뒤에 종료되도록 설정
		//데몬쓰레드는 다른 쓰레드 종료 시 자동종료
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 쓰레드가 종료됩니다.");
	}

}
