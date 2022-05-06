
/*
재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.
크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.
***
* *
***
N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다. 예를 들어 크기 27의 패턴은 예제 출력 1과 같다.

입력
첫째 줄에 N이 주어진다. N은 3의 거듭제곱이다. 즉 어떤 정수 k에 대해 N=3^k 이며, 이때 1 ≤ k < 8이다.

출력
첫째 줄부터 N번째 줄까지 별을 출력한다.

예제 입력 1 
27

예제 출력 1 
*************************** *************************** * * * * * * * * *	
* ** ** ** ** ** ** ** ** * * ** ** ** ** ** ** ** ** * *   * *   * *   *	
*************************** *************************** * * * * * * * * *
							***   ******   ******   *** * * *       * * *	
***   ******   ******   *** * *   * ** *   * ** *   * * *   *       *   *	
* *   * ** *   * ** *   * * ***   ******   ******   *** * * *       * * *   
***   ******   ******   *** *************************** * * * * * * * * *    
							* ** ** ** ** ** ** ** ** * *   * *   * *   * 
*************************** *************************** * * * * * * * * *
* ** ** ** ** ** ** ** ** * *********         *********
*************************** * ** ** *         * ** ** *
							*********         *********
*********         ********* ***   ***         ***   ***
* ** ** *         * ** ** * * *   * *         * *   * *
*********         ********* ***   ***         ***   ***
							*********         ********* 
***   ***         ***   *** * ** ** *         * ** ** *
* *   * *         * *   * * *********         *********
***   ***         ***   *** ***************************
							* ** ** ** ** ** ** ** ** *
*********         ********* ***************************
* ** ** *         * ** ** * ***   ******   ******   ***
*********         ********* * *   * ** *   * ** *   * *
							***   ******   ******   ***
*************************** ***************************
* ** ** ** ** ** ** ** ** * * ** ** ** ** ** ** ** ** *
*************************** ***************************

***   ******   ******   ***
* *   * ** *   * ** *   * *
***   ******   ******   ***

***************************
* ** ** ** ** ** ** ** ** *
***************************

0 0 0 
1 1 1 
0 0 0 
0 2 0 
1 2 1 
0 2 0 
0 0 0 
1 1 1 
0 0 0

 */




import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 재귀_4번문제_2447번 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	  public static void main(String[] args) throws IOException {
	      
	      Scanner sc = new Scanner(System.in);
	      int N = sc.nextInt();
	      int idx = 0, k = 0;
	       sc.close();

	       
	      	    
	      stars(N, idx);
	      bw.flush();
	      bw.close();
	   }

	   public static void stars(int N, int idx) throws IOException {
		  int count = 1;
	      if(idx == N) return;
	      char star = '*';
	      
	      for(int i = 0; i<N; i++) {
	    	  
	    	  if((idx/27%3 == 1 && i / 27 % 3 == 1)|| (idx/3%3 == 1 && i/3%3 == 1) || (idx % 3 == 1 && i % 3 == 1) || (idx/9%3 == 1 && i/9%3 == 1) || (idx/81%3 == 1 && i/81%3 == 1) || (idx/243%3 == 1 && i/243%3 == 1) || (idx/729%3 == 1 && i/729%3 == 1) || (idx/2187%3 == 1 && i/2187%3 == 1)) {
	    		  bw.write(" ");
	    		  continue;
	    	  }
	    	  	    	  
	    	  bw.write(star);
	      }
	      
	      
	      bw.write("\n");
	      
	      stars(N, idx+1);
	            	      
	   }
}
	   
	   

