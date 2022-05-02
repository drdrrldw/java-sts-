package kr.human.Java0502;

import java.util.HashMap;
import java.util.Iterator;

// Map : (키, 값) 쌍으로 저장하는 자료구조


public class MapEx02 {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "한사람");
		map.put(2, "두사람");
		map.put(3, "세사람");
		map.put(1, "네사람");
		
		System.out.println(map.size() + "개 : "+ map);
		System.out.println(map.get(2));
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("오사람"));
		
		
		for(int key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("-".repeat(60));
		
		
		for(String value : map.values()) {
			System.out.println(value);
		}
		System.out.println("-".repeat(60));
		
		Iterator<String> it = map.values().iterator();
		while(it.hasNext()) 
			System.out.println(it.next());
		
	}
}
