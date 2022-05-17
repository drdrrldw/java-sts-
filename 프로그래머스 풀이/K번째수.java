package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class K번째수 {
	public static void main(String[] args) {
		
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		
	 System.out.println(Arrays.toString( solution(array, commands))); 
		
	}
	
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int[] result = {};
		
		int index = 0;
		for(int h = 0; h<commands.length; h++) {
			int i = commands[h][0];
			int j = commands[h][1];
			int k = commands[h][2];
			
			
			result = Arrays.copyOfRange(array, i-1, j);
			Arrays.sort(result);
			answer[index] = result[k-1];
			index++;
		}
		
		
		
		
		
		return answer;
	}
	
	
}
