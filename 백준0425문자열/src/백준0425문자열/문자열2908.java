/*

 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 
 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 

 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
 
상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 
예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 
따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 	두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.

출력
첫째 줄에 상수의 대답을 출력한다.

예제 입력 1 
734 893

예제 출력 1 
437

예제 입력 2 
221 231

예제 출력 2 
132

예제 입력 3 
839 237

예제 출력 3 
938

 */


package 백준0425문자열;

import java.util.Scanner;
public class 문자열2908 {	// 7번문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		
		int h1 = 0, t1 = 0, d1 = 0;
		int h2 = 0, t2 = 0, d2 = 0;
		
		int sumA = 0, sumB = 0;
		h1 = A/100;
		t1 = (A/10)%10;
		d1 = A%10;

		h2 = B/100;
		t2 = (B/10)%10;
		d2 = B%10;
		
		sumA = (d1*100) + (t1*10) + h1;
		sumB = (d2*100) + (t2*10) + h2;
		
		if(sumA > sumB) System.out.println(sumA);
		if(sumA < sumB) System.out.println(sumB);
	}

}
