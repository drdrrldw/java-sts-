package kr.human.java0427;

class Up{
	
	public void show() {
		System.out.println("나는 부모의 메서드 입니다.");
	}
	
	@Override
	public String toString() {
		return "Up";
	}
}

class Down extends Up{
	
	
	public void show() {
		System.out.println("나는 자식의 메서드 입니다.");
	}
	
	
	@Override
	public String toString() {
	
		return "Down";
	}
}



public class UpDownEx {
	public static void main(String[] args) {
		Up up = new Up();
		Down down = new Down();	// 자신의 타입이 자신의 객체를 가지는것은 정상!!
		
//		Down down2 = new Up();  // 자식의 타입에 부모의 객체를 대입하면 에러!!
//		Down down2 = (Down)new Up();  // 자식의 타입에 부모의 객체를 형변환해서 대입하면 가능!! 하지만 실행에러
									  // ClassCastException 예외 발생
		
		Up up2 = new Down();	// 부모타입의 변수에 자식의 객체대입 가능!!  ==> UpCasting
		up2.show();
		
		Down down2 = (Down)up2;	// up2가 Up타입이지만 실제 자식의 타입을 가리키고 있으므로 예외발생하지 않는다.
		down2.show();
		
		// instanceof 연산자 : 객체 instanceof 타입 ==> 객체를 타입에 대입 가능한지를 알려준다.
		System.out.println(down instanceof Up);
		System.out.println(down instanceof Down);
		System.out.println(down2 instanceof Up);
		System.out.println(down2 instanceof Down);
		
	}
}
