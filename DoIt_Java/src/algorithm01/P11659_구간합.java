package algorithm01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11659_구간합 {

	public static void main(String[] args) throws IOException {
		
		// 입력장치
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// 입력값 읽기
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		// 숫자 개수
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		// 질의 개수
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		
		
		// 합배열
		long[] S = new long[suNo + 1];
		// 입력한 숫자
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		// 구간합 구해서 넣기
		for(int i = 1; i <= suNo; i++) {
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		
		// 구간 정해주기
		for(int q = 0; q < quizNo; q++) {
			
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			
			// 정해준 구간의 구간합
			System.out.println(S[j] - S[i - 1]);
		}
		
	}

}
