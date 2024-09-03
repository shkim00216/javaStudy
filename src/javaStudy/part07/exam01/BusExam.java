package javaStudy.part07.exam01;

public class BusExam {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		//Bus class 는 아무런 코드를 가지지 않는다. 그럼에도 run 이라는 메소드를 사용하는데 문제가 발생되지 않는다.
		bus.ppangppang();
		
		Car car = new Car();
		car.run();
//		car.ppangppang(); //실행 불가
	}

}
