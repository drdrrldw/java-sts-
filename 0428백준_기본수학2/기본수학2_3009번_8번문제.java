/*

점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

입력
세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

출력
직사각형의 네 번째 점의 좌표를 출력한다.

예제 입력 1 
5 5
5 7
7 5

예제 출력 1 
7 7


예제 입력 2 
30 20
10 10
10 20

예제 출력 2 
30 10


 */


import java.util.Scanner;

public class 기본수학2_3009번_8번문제 { // 성공
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		int x =0, y=0;
		
		if(x1 == x2) x = x3;
		else if(x2 == x3) x = x1;
		else if(x1 == x3) x = x2;
		
		if(y1 == y2) y = y3;
		else if(y2 == y3) y = y1;
		else if(y1 == y3) y = y2;
		
		System.out.println(x + " " + y);
		
	}
}
