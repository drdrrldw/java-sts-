package kr.human.java0428;

public class SpeedEx {
	public static void main(String[] args) {
		String str = "";
		StringBuffer sBuffer = new StringBuffer();
		StringBuilder sBuilder = new StringBuilder();
		
		
		
		// String 객체는 불변객체이다.  변할수 없다.
		long start = System.currentTimeMillis();
		for(int i = 0; i<10000; i++) {	// "꽝"을 붙여서 10000글자를 만들어보자  ==> 10000개의 객체가 생긴다.
			str += "꽝";
			
		}
		
		System.out.println("실행시간 : " + (System.currentTimeMillis()-start) + "ms");
		System.out.println();
		
		
		// StringBuffer나 StringBuilder는 가변객체로 연산을하면 자기 자신이 변경된다.
		// StringBuffer는 멀티스레드 프로그램에 안전하게 설계되어있고
		// StringBuilder는 싱글 스레드 프로그램에만 안전하게 설계 되어 나중에 발표됨~!
		start = System.currentTimeMillis();
		for(int i = 0; i<10000; i++) {	// "꽝"을 붙여서 10000글자를 만들어보자 ==> 1개의 객체가 생긴다.
			sBuffer.append("꽝");		
			
		}
		
		System.out.println("실행시간 : " + (System.currentTimeMillis()-start) + "ms");
		System.out.println();
		
		
		start = System.currentTimeMillis();
		for(int i = 0; i<10000; i++) {	// "꽝"을 붙여서 10000글자를 만들어보자 ==> 1개의 객체가 생긴다.
			sBuilder.append("꽝");
			
		}
		
		System.out.println("실행시간 : " + (System.currentTimeMillis()-start) + "ms");
		System.out.println();
		
		
		
		
	}
}
