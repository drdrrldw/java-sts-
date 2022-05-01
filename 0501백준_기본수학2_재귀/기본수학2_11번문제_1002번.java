package 백준0501기본수학2;

import java.util.Scanner;

public class 기본수학2_11번문제_1002번 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int x1, y1, r1, x2, y2, r2;

		while (T > 0) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();

			double distance = 0;
			int disX = x1 - x2;
			int disY = y1 - y2;
			distance = Math.pow(disX, 2) + Math.pow(disY, 2);

			int temp;
			if (r1 > r2) {
				temp = r1;
				r1 = r2;
				r2 = temp;
			}
			double rSum = Math.pow(r1+r2, 2);
			double rDiff = Math.pow(r2-r1, 2);
			
			if(x1 == x2 && y1 == y2 && r1 == r2)  System.out.println("-1");
			else {
				if(distance > rDiff && distance < rSum) System.out.println("2");
				else if(distance == rSum || distance == rDiff) System.out.println("1");
				else if(distance > rSum || distance < rDiff || distance == 0) System.out.println("0");
				
			}
			
			
			T--;
		}

	}
}
