

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;

public class 재귀_5번문제_11729번 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		int count = hano(N, 1, 2, 3, 0, sb);
		
		bw.write(String.valueOf(count)+"\n");
		bw.write(sb.toString());
		
		br.close();
		bw.flush();
		bw.close();
		
		
	}
	
	public static int hano(int n, int start, int sub, int to, int count, StringBuilder sb) {
		
		count++;
		
		if(n == 1) {
			sb.append(start + " " + to + "\n");
			return count;
		}
		
		count = hano(n-1, start, to, sub, count, sb);
		sb.append(start + " " + to + "\n");
		count = hano(n-1, sub, start, to, count, sb);
		
		return count;
	}
}