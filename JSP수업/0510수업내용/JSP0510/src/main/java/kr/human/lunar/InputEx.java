package kr.human.lunar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class InputEx {
	public static void main(String[] args) {
		System.out.print("1글자 입력 : ");
		int n = 0;
		try {
			n = System.in.read();
			System.out.println("입력한 글자 : " + (char)n);
			// 마지막에 입력한 엔터(\r\n)를 읽어서 버림
			System.in.read();
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("1줄입력 : ");
		String str = "";
		do {
			try {
				n = System.in.read();
				str += (char)n;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}while(n!='\n');
		System.out.println("입력한 내용 : " + str);

		Scanner sc = new Scanner(System.in);
		System.out.print("1줄입력 : ");
		str = sc.nextLine();
		System.out.println("입력한 내용 : " + str);
		//sc.close();
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			System.out.print("1줄입력 : ");
			str = br.readLine();
			System.out.println("입력한 내용 : " + str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
