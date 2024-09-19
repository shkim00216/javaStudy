package javaStudy.part11.exam02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		boolean flag1 = set1.add("kim"); //boolean값 저장 -> 같은 값 있으면 false
		boolean flag2 = set1.add("lee");
		boolean flag3 = set1.add("kim");
		
		System.out.println(set1.size()); //저장된 크기 출력, 3개 저장하였지만 중복 안되므로 2개 출력
		System.out.println(flag1); //true
		System.out.println(flag2); //true
		System.out.println(flag3); //false
		
		Iterator<String> iter = set1.iterator(); //Iterator 인터페이스 사용
		
		while (iter.hasNext()) { //자료구조에 데이터가 있니? 있으면 true 리턴
			String str = iter.next(); //값을 꺼내줘, 하나 꺼내면 다음 것 참조
			System.out.println(str);
		}
	}

}
