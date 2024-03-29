package algorithm01;

import java.util.Scanner;

public class 디버깅_오류 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int answer = 0;
		
		long A[] = new long[100001];
		long S[] = new long[100001];
		
		for(int i = 1; i < 100000; i++) {
			A[i] = (int)(Math.random() * Integer.MAX_VALUE);
			S[i] = S[i - 1] + A[i];
		} // end for
		
		
		for(int t = 1; t < testcase; t++) {
			
			int query = sc.nextInt();
			
			for(int i = 0; i < query; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				answer += S[end] - S[start - 1];
				System.out.println(t + " " + answer);
			} // end for i
		} // end for t
	}
}
