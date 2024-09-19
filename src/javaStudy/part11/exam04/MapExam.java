package javaStudy.part11.exam04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("001","kim");
		map.put("002","lee");
		map.put("003","choi");
		
		map.put("001","kang"); //같은 key가 2개는 안되므로, kang으로 값이 변경됨
		
		System.out.println(map.size()); //3개 출력
		
		System.out.println(map.get("001")); //kang
		System.out.println(map.get("002")); //lee
		System.out.println(map.get("003")); //choi
		
		Set<String> keys = map.keySet(); //map에 저장된 모든 key들을 set 자료구조로 꺼냄
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
