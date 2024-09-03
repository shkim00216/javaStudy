package javaStudy.part07.exam06;

public class BusExam {

	public static void main(String[] args) {
		Car c = new Bus(); //부모 타입으로 자식을 가리킬 수 있으나 부모가 가지고 있는 메서드만 활용 가능
		c.run();
//		c.ppang(); //컴파일 오류
		
		Bus bus = (Bus)c; //부모 타입을 자식 타입으로 형변환
		bus.run();
		bus.ppang();
	}

}
