/*
 
 N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

예제 
입력  
5
20 10 35 30 7

출력  
7 35
 
 
 */

package 백준알고리즘0421;

import java.util.Arrays;
import java.util.Scanner;

public class 배열10818 {	//1번째 문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		do {
			N = sc.nextInt();
		}while(N<1 || N>1000000);
		
		
		int ar[] = new int[N];
		int index = 0;
		while(N>0) {
			ar[index] = sc.nextInt();
			N--;
			index++;
		}
		
		Arrays.sort(ar);
		System.out.print(ar[0] + " ");
		System.out.print(ar[index-1] + " ");
		
	}

}
