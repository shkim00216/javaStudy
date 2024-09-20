package javaStudy.part16.exam03;

import java.util.ArrayList;
import java.util.List;

public class CarExam {
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("작은차", 2, 800, 3));
		cars.add(new Car("봉고차", 12, 1500, 8));
		cars.add(new Car("중간차", 5, 2200, 0));
		cars.add(new Car("비싼차", 5, 3500, 1));
		
//		printCar(cars, new CheckCar() {
//			public boolean test(Car car) {
//				return car.capacity >= 4 && car.price < 2500;
//			}
//		}); //익명클래스 사용
		
		CarExam.printCar(cars, 
					//인터페이스 CheckCar의 test메서드에 대응하는 람다 만들기
					(Car car) -> {
						return car.capacity >= 4 && car.price < 2500;
					}
				);
	}
	
	public static void printCar(List<Car> cars, CheckCar tester) {
		for(Car car : cars) {
			if(tester.test(car)) {
				System.out.println(car);
			}
		}
	}
	
	interface CheckCar {
		boolean test(Car car);
	}
	
//	static class CheckCarForBigAndNotExpensive implements CheckCar {
//		public boolean test(Car car) {
//			return car.capacity >= 4 && car.price < 2500;
//		}
//	}
}
