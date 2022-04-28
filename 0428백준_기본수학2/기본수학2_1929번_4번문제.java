package 백준;

import java.util.Scanner;

public class 백준기본수학2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();

		boolean[] ar = new boolean[N + 1];

		ar[0] = ar[1] = true;

		for (int i = 2; i * i <=N; i++) {
			if (!ar[i]) {
				for (int j = i * i; j <= N; j += i) {
					ar[j] = true;
				}
			}
		}
		
		
		for(int k = M; k<=N; k++) {
			if(!ar[k]) System.out.println(k);
		}
		
		
	}
}
