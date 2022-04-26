/*



 */

import java.util.Scanner;

public class 기본수학2292 { // 2번문제  해결
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long N = sc.nextInt();

		long end = 1, j = 2;
		long i;

		if (N == 1)
			System.out.println(1);

		if (N != 1) {

			for (i = 1; i <= 30000; i++) {
				end += 6 * i;
				for (j = j; j <= end; j += 6 * i) {
					if (j <= N && N <= end) {
						System.out.println(i + 1);
						i = 30001;
						break;
					}
				}

			}

		}

	}
}
