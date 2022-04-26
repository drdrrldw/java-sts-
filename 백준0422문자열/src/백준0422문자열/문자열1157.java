/*
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

예제 입력 1 
Mississipi

예제 출력 1 
?


예제 입력 2 
zZa

예제 출력 2 
Z


예제 입력 3 
z

예제 출력 3 
Z


예제 입력 4 
baaa

예제 출력 4 
A

 */
package 백준0422문자열;
import java.util.Arrays;
import java.util.Scanner;
public class 문자열1157 { // 5번 문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		str = str.toUpperCase();
		int[] ar = new int[26];
		char mostAbc = 'A';
		
		for(int i = 0; i<str.length(); i++) {
			ar[str.charAt(i)-65]++;
		}
		
		
		
		int maxNum = 0, index = 0;
		for(int i = 0; i<ar.length;i++) {
			for(int j =0; j<i; j++) {
				if(ar[i]>ar[j] && ar[i] > maxNum) {
					maxNum = ar[i];
					index = i;
				}else if(ar[i]<ar[j] && ar[j]>maxNum) {
					maxNum = ar[j];
					index = j;
				}
			}
		}
		
		mostAbc = (char)(index+65);
		
		Arrays.sort(ar);
		if(ar[24] == ar[25]) mostAbc = '?';
		System.out.println(mostAbc);
		
		
		sc.close();

	}

}
