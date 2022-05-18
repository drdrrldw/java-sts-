package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class 제일작은수제거하기 {
	public static void main(String[] args) {
		int[] arr = {4,3,2,1,5};
		int[] arr2 = {10};
		
		System.out.println(Arrays.toString( solution(arr)));
		System.out.println(Arrays.toString( solution(arr2)));
		
		
	}
	
	
	
	 public static int[] solution(int[] arr) {
	        int[] answer = {};
	        ArrayList<Integer> al = new ArrayList<>();
	        for(int i : arr) al.add(i);
	        
	        if(al.size() != 1) {
	        	al.remove( Collections.min(al));
	        	answer = new int[al.size()];
	        	for(int i=0; i<al.size(); i++) {
	        		answer[i] = al.get(i);
	        	}
	        }
	        else {
	        	answer = new int[1];
	        	answer[0] = -1;
	        }
	        
	        return answer;
	 }
	 
	 
}
