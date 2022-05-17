package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class 최소직사각형 {
	public static void main(String[] args) {
		int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
		int[][] sizes2 = {{10,7},{12,3},{8,15},{14,7},{5,15}};
		int[][] sizes3 = {{14,4},{19,6},{6,16},{18,7},{7,11}};
		
		System.out.println( solution(sizes));
		System.out.println( solution(sizes2));
		System.out.println( solution(sizes3));
		
		
		
		
	}
	
	
	public static int solution(int[][] sizes) {
		int answer = 0;
		int w = 0,h = 0;
		
		for(int i =0; i<sizes.length; i++) {
			w = sizes[i][0];
			h = sizes[i][1];
			if(w > h) {
				sizes[i][1] = w;
				sizes[i][0] = h;
			}
		}
		
		Arrays.sort(sizes, (o1, o2) -> {
		    return o2[0]-o1[0]; // 첫번째 숫자 기준 오름차순 {1,30}{2,10}{3,50}{4,20}{5,40}
		});
		
		w = sizes[0][0];
		
		Arrays.sort(sizes, (o1, o2) -> {
		    return o2[1]-o1[1]; // 첫번째 숫자 기준 오름차순 {1,30}{2,10}{3,50}{4,20}{5,40}
		});
		
		h = sizes[0][1];
				
		
		answer = w*h;	
		
		return answer;
	}
	
}
