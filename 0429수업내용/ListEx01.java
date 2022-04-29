package kr.human.Java0429;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

// List : 입력순서가 중요할 때 사용하는 자료구조
public class ListEx01 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("한사람");
		v.add("두사람");
		v.add("세사람");
		v.add("네사람");
		v.add("오사람");	// add : 추가
		System.out.println(v.capacity() + ", " + v.size() + " : " + v); // capacity : 용량 ,  size : 갯수
		
		v.add("세사람");
		v.add("네사람");
		v.add("오사람");
		System.out.println(v.capacity() + ", " + v.size() + " : " + v);

		v.add("세사람");
		v.add("네사람");
		v.add("오사람");
		System.out.println(v.capacity() + ", " + v.size() + " : " + v);
		
		v.addElement("나인간");
		v.addElement("너인간");
		System.out.println(v.capacity() + ", " + v.size() + " : " + v);
		
		v.set(0, "고친놈");
		v.setElementAt("변경인", 2); 	// 수정
		System.out.println(v.capacity() + ", " + v.size() + " : " + v);
		
		
		System.out.println(v.get(4));  // 가져오기
		System.out.println(v.elementAt(4));  // 가져오기
		
		v.remove(3);
		v.remove("세사람");	 // 지우기
		System.out.println(v.capacity() + ", " + v.size() + " : " + v);
		
		v.add(0, "추가인");
		v.add(5, "추가인2");	// 삽입가능
		System.out.println(v.capacity() + ", " + v.size() + " : " + v);
	
		System.out.println("-".repeat(50));
		System.out.println();
		
		System.out.println("반복1");
		// 반복 1.
		for(int i= 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println("-".repeat(50));
		
		System.out.println("반복2");
		// 반복 2.
				for(String s : v) {
					System.out.println(s);
				}
				
				System.out.println("-".repeat(50));
				
		System.out.println("반복3");
		// 반복 3.
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-".repeat(50));
		
		
		
		System.out.println("반복4");
		// 반복 4.
		Enumeration<String> em = v.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		System.out.println("-".repeat(50));
		

		// Iterator, Enumeration : 단방향 검색
		// ListIterator : 쌍방향 검색 지원
		ListIterator<String> it2 = v.listIterator();
		System.out.println(it2.next());
		System.out.println(it2.next());
		System.out.println(it2.next());
		System.out.println(it2.previous());
		System.out.println(it2.previous());
		System.out.println(it2.previous());
		System.out.println("-".repeat(50));
		
		
		
		
		
		v.clear();
		System.out.println(v.capacity() + ", " + v.size() + " : " + v);
		
		v.add("줄어들까?");
		System.out.println(v.capacity() + ", " + v.size() + " : " + v);
		
		v.trimToSize();
		System.out.println(v.capacity() + ", " + v.size() + " : " + v);
	}
}
