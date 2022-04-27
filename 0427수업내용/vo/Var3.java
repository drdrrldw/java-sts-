package kr.human.vo;

import kr.human.java0427.Var;

public class Var3 extends Var {
	
	
	public void view() {
//		Var var = new Var();	// 내가 만든 클래스라도 다른 패키지에 있으면 import 해야한다.
		// 같은 클래스 내부에서는 모두 사용 가능하다.
//		System.out.println("private 변수 : " + var.priValue);	// 자식이어도 사용 불가
//		 에러다! private 멤버는 그 클래스 내부에서만 사용 가능하다.
//		System.out.println("default 변수 : " + var.defValue);	// default 는 같은 패키지 내에서는 사용 가능
		System.out.println("protected 변수 : " + proValue);	// protected는 다른패키지의 자식은 사용 가능하다.
		System.out.println("public 변수 : " + pubValue);
	}
	
	
	
}
