package kr.human.Java0429;

import java.util.Arrays;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		
		// 자바 클래스의 최고 조상이 Object이기 때문에 무엇이든 담을 수 있지만
		
		Object[] objects = {1, 1.2, "문자열", new Date()};
		
		System.out.println(Arrays.toString(objects));
		
		for(int i = 0; i<objects.length; i++) {
			System.out.println(objects[i]);	// 출력은 가능,,  가공처리한다면?
											// ...-> 항상 형변환해서 사용해야한다.
			
			
			
		}
		
		
		
		
	}
}
