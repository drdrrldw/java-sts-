package kr.human.java0428;

import java.io.File;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


//사용자가 만드는 예외 클래스
class SectionNotFountException extends Exception{

	private static final long serialVersionUID = 3126019020924604405L;

	public SectionNotFountException(String message) {
		super(message);
	}
}



public class ExceptionEx06 {
	public static void main(String[] args) {
		// 외부 자원에 접근할때는 예외 처리가 필수이다
		Scanner sc = null;
		try {
			sc = new Scanner(new URL("https://www.naver.com").openStream());
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}			
			throw new SectionNotFountException("글이없네용");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SectionNotFountException e) {

			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
