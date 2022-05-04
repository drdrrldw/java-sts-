package kr.human.Java0504;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;

public class 백준_스택_1번_10828번문제 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<N; i++) {
			String[] str = br.readLine().split(" ");
			
						
				if(str[0].equals("push")) {
					stack.push(Integer.parseInt(str[1]));
				} 
				else if(str[0].equals("top")) {
				    try {
						System.out.println( stack.peek());
					} catch (Exception e) {
						System.out.println("-1");
					}
					
				} 
				else if(str[0].equals("size")) {
					System.out.println( stack.size());
				} 
				else if (str[0].equals("empty")) {
					System.out.println(stack.isEmpty()? "1":"0");
				} 
				else if(str[0].equals("pop")) {
					try {
						System.out.println(stack.pop());
					} catch (Exception e) {
						System.out.println("-1");
					}
				}

		
		}
		
		
		
		
		
	}
}
