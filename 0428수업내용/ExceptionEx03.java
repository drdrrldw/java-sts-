package kr.human.java0428;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 예외가 발생할 소지가 있는 부분을 try블록으로 감싼다.
		try {
		
		System.out.println("두개의 정수 입력 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = x/y;
		
		System.out.println(x + "/" + y + " = " + result);
		} catch (ArithmeticException e) {		// 발생이 예상되는 예외를 catch로 잡아준다.
			System.out.println("예외 발생 : " + e.getMessage());
			
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력해야 합니다.");
			System.out.println("예외 발생 : " + e.getMessage());
			e.printStackTrace(); 	// 예외추적
		} catch (Exception e) {	// 모든 예외 클래스의 조상클래스 Exception 이다.
			System.out.println("알수 없는 예외입니다.");
		} finally {
			System.out.println("예외 발생 유무와 상관없이 무조건 실행");
		}
		
		
		
		sc.close();
	}
}
