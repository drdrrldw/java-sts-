package 프로그래머스;

public class 평균구하기 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] arr2 = {5,5};
		
		System.out.println( solution(arr));
		System.out.println( solution(arr2));
		
	
		
	}
	
	
	
	public static double solution(int[] arr) {
        double answer = 0;
        double sum=0;
        for(int i : arr) {
        	sum += i;
        }
        
        answer = sum/arr.length;
        
        
        return answer;
    }
}
