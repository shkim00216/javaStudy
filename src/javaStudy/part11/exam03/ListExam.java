package javaStudy.part11.exam03;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("kim");
		list.add("lee");
		list.add("kim");
		
		System.out.println(list.size()); //중복 허용하므로 3 출력
		
		for(int i=0; i<list.size(); i++) { //인덱스 지정 가능
			String str = list.get(i); //값 꺼내오기
			System.out.println(str);
		}
	}

}
