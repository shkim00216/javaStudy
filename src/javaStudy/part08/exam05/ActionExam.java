package javaStudy.part08.exam05;

public class ActionExam {

	public static void main(String[] args) {
//		Action action = new MyAction();
//		action.exec();
		Action action = new Action() {
			
			@Override
			public void exec() {
				System.out.println("exec");
			}
		}; //MyAction을 사용하지 않고 Action을 상속받는 익명 클래스를 만들어서 사용하도록 수정
		action.exec();
	}

}
