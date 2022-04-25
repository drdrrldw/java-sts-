/*


 */


package 백준0425문자열;

import java.util.Scanner;
public class 문자열5622 {	// A -> 65 // 8번문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		
		int[] alpha = new int[] {3,3,3,4,4,4,5,5,5,6,6,6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 0};
//							 	 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
		
		
		int time = 0;
		
		
		for(int i = 0; i<word.length(); i++) {
				time += alpha[word.charAt(i)-65];
		}
		
		System.out.println(time);
		
	}

}
