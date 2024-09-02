package javaStudy.part05.exam04;

public class CarExam {
	
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		//Car라는 인스턴스가 메모리에 2개 만들어짐 | 객체별로 name과 number라는 속성을 가짐
		
		c1.name = "소방차";
		c1.number = 1234;
		
		c2.name = "구급차";
		c2.number = 1004;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		
		System.out.println(c2.name);
		System.out.println(c2.number);
	}
}

