package 프로그래머스;


import java.util.HashSet;


public class 폰켓몬 {
	public static void main(String[] args) {
		int[] nums = {3,1,2,3};
		int[] nums2 = {3,3,3,2,2,4};
		int[] nums3 = {3,3,3,2,2,2};
		
		System.out.println( solution(nums));
		System.out.println( solution(nums2));
		System.out.println( solution(nums3));
		
		
		
		
		
	}
	
	public static int solution(int[] nums) {
		int answer=0;
		
		int size = nums.length/2;
		HashSet<Integer> set = new HashSet<>();
		for(int i : nums) {
			set.add(i);
		}
		
		if(set.size() > size) answer = size;
		else answer = set.size();
		
		
		return answer;
	}
	
}
