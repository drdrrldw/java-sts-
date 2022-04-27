package kr.human.vo;

public class Var2 {
	
	
	public void view() {
		Var var = new Var();
		// 같은 클래스 내부에서는 모두 사용 가능하다.
//		System.out.println("private 변수 : " + var.priValue);
		// 에러다! private 멤버는 그 클래스 내부에서만 사용 가능하다.
		System.out.println("default 변수 : " + var.defValue);	// default 는 같은 패키지 내에서는 사용 가능
		System.out.println("protected 변수 : " + var.proValue);
		System.out.println("public 변수 : " + var.pubValue);
	}
	
	
	
}
