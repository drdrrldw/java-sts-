package kr.human.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Ex05_lambda05 {
	public static void main(String[] args) {
		// 매개변수의 타입과 반환타입이 일치하는 함수형 인터페이스
		// UnaryOperator<T> : 인수 1개 리턴 1개
		// BinaryOperator<T> : 인수 2개 리턴 1개
		UnaryOperator<Integer> doubleValue = (i) -> i*2;
		System.out.println(doubleValue.apply(4));
		System.out.println(doubleValue.apply(9));
		System.out.println();
		
		List<Integer> list = new ArrayList<>(); 
		for(int i = 0; i<10; i++) list.add((int)(Math.random()*101)); // 0~100 까지의 난수로 초기화
		System.out.println(list);
		 
		
		// 최댓값 / 최솟값을 구하고 싶다.
		
		int max = list.get(0), min = list.get(0);	// 배열이나 컬렉션일 경우 첫번째 값으로 초기화
		
		for(int i  : list) {
			if(max < i) max = i;
			if(min > i) min = i;
		}
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		
		
		// 람다식으로 해보자
		BinaryOperator<Integer> maxFn = (n, m) -> n<m ? m:n;
		BinaryOperator<Integer> minFn = (n, m) -> n>m ? m:n;
		
		max = list.get(0); min = list.get(0);
		for(int i  : list) {
			max = maxFn.apply(max, i);
			min = minFn.apply(min, i);
		}
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		
		
	}
}
