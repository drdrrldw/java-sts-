package kr.human.lambda;

import java.util.function.Predicate;

public class Ex02_lambda02 {
	// 문자열의 길이가 0인지를 판단하는 함수를 만들어서 사용하고 싶다.
	// ==> 인수가 1개 리턴값이 boolean 이다. ==> Predicate를 사용
	public static void main(String[] args) {
		System.out.println(isEmpty(null) ? "있다" : "없다");
		System.out.println(isEmpty("") ? "있다" : "없다");
		System.out.println(isEmpty("하하하") ? "있다" : "없다");
		System.out.println();
		
		// 함수형 인터페이스를 구현해서 사용해보자
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String t) {
					
				return t != null && t.length() != 0;
				}
		};
		
		System.out.println(predicate.test(null) ? "있다" : "없다");
		System.out.println(predicate.test("") ? "있다" : "없다");
		System.out.println(predicate.test("하하하") ? "있다" : "없다");
		System.out.println();
		
		
		// 함수형 인터페이스를 구현해서 사용해보자
				Predicate<String> predicate2 = (t) -> t != null && t.length() != 0;
						
			
				
				System.out.println(predicate2.test(null) ? "있다" : "없다");
				System.out.println(predicate2.test("") ? "있다" : "없다");
				System.out.println(predicate2.test("하하하") ? "있다" : "없다");
				System.out.println();
	}
		
		
	// 지금까지의 방식
	public static boolean isEmpty(String str) {
		return str != null && str.length() != 0;
	}
}
