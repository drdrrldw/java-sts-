package kr.human.MavenEx02;

import java.util.Arrays;
import java.util.Random;

import lombok.Data;

@Data
public class InitValue {
	// 두개의 변수를 난수로 초기화해야 한다라고 가정하면
	//선언시 초기화
	
	private int[] instancedata = new int[10];
	private static int[] staticDate = new int[10];
	
	//초기화 블록
	// 인스턴스 초기화 블록 : 인스턴스 변수를 초기화 할때 사용한다. 
	// 						  하지만 생성자에서도 초기화가 가능하므로 잘 사용되지 않는다.
	{	Random random = new Random();
		System.out.println("인스턴스 초기화 블록");
		for(int i = 0; i<instancedata.length; i++) {
			instancedata[i] = random.nextInt(101);
		}
		
	}
	
	// 정적 초기화 블록 : 정적 변수를 초기화 할때 사용한다.
	static {
		Random random = new Random();
		System.out.println("정적 초기화 블록");
		for(int i = 0; i<staticDate.length; i++) {
			staticDate[i] = random.nextInt(101);
		}
	}
	
	public InitValue() {
		System.out.println("생성자 호출!!!");
	}
	
	
	public static void viewStaticMember() {
		System.out.println(Arrays.toString(staticDate));
	}
	
}
