package kr.human.java0428;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("한사람");
		StringBuffer sb2= new StringBuffer("한사람");
		
		System.out.println(sb1 == sb2 ? "같다" : "다르다");
		System.out.println(sb1.equals(sb2) ? "같다" : "다르다");
		
		//엥~ 같은지 판단 못한다.
		
		System.out.println(sb1.toString().equals(sb2.toString())? "같다" : "다르다");
		
		System.out.println("용량 : " + sb1.capacity()); 	// 기본값 16였지만
		sb1.append("하하하하하");
		sb1.append("하하하하하");
		sb1.append("하하하하하");
		sb1.append("하하하하하");	// 계속 추가하면 용량이 자동으로 늘어난다.
		System.out.println("용량 : " + sb1.capacity());
		
		
		// 계속 용량이 증가되면 메모리 이동이 내부적으로 일어나서 속도의 저하를 가져올 수 있다.
		// 그래서 어느정도의 크기가 들어갈 것을 예측가능하면 처음에 용량을 지정가능하다.
		
		StringBuffer sb3 = new StringBuffer();
		StringBuffer sb4 = new StringBuffer(10000);
		System.out.println("용량 : " + sb3.capacity());
		System.out.println("용량 : " + sb4.capacity());
		
		int i = 100;
		Integer ii = 200;
		i = Integer.valueOf("123");		// 리턴값이 Integer 형이다.
		ii = Integer.parseInt("123");	// 리턴값이 int 형이다.
	
		System.out.println(i);
		System.out.println(ii);
		
		
	}
}
