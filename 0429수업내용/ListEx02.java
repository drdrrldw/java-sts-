package kr.human.Java0429;

import java.util.Random;
import java.util.Vector;

public class ListEx02 {
	public static void main(String[] args) {
		
		// Vector 클래스는 옛부터 지원되는 클래스로 멀티 쓰레드에 안전하게 설계 되었다.
		// 싱글 스레드에 적합하게 개량된 리스트는 ArrayList, LinkedList... 등이 있다.
		// 성능 개선된 클래스 들에는 Element 가 들어간 메서드들은 삭제되었다.
		
		Vector<Integer> v = new Vector<>(20, 5); // Vector<>(초기용량, 증가용량);
		
		Random rnd = new Random();
		for(int i = 0; i<v.capacity(); i++) v.add(rnd.nextInt(101));
		
		System.out.println("용량 : " + v.capacity() + ", 개수 : " + v.size());
		System.out.println(v);
		
		
		// 데이터 중 50 이상의 값을 제거 하겠다.
		/*
		// 앞에서부터 지우면 인덱스값이 변경되어 당겨지므로 삭제되지 않는 값이 생긴다.
		for(int i = 0; i<v.size(); i++) {
			if(v.get(i) >= 50) v.remove(i);
		}
		*/
		
		//	조건에 맞춰 지울때는 항상 뒤에서 부터 작업해라.
		for(int i =v.size()-1; i>=0; i--) {
			if(v.get(i) >= 50) v.remove(i);
		}
		
		
		
		
		System.out.println("용량 : " + v.capacity() + ", 개수 : " + v.size());
		System.out.println(v);
		
		
	}
}
