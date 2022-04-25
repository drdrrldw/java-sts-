/*



 */


package 백준0425기본수학;

import java.util.Scanner;

public class 기본수학2292 { 	//2번문제  해결못함 97% 에서 틀림
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextInt();
		
		long end = 1, j=2;
		long i;
		
		
		for(i = 1; i<=30000; i++) {
			end += 6*i;
				for(j=j ; j <= end; j+=6*i) {
						if(j <= N && N <= end) {
							System.out.println(i+1);
							i = 30001;
							break;
						}
				}

		}
	
	
	
	}
}
