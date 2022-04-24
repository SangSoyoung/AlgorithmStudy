package codility;

import java.util.Scanner;

public class Codility01 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// N을 입력받음
		int N = sc.nextInt();
		String sNum = String.valueOf(N);
		
		// N을 쪼개서 배열에 넣음
		char[] cNum = sNum.toCharArray();
		System.out.println("N : " + N);
		
		// N의 배열값 총합 구하기
		int sumN = 0;
		for(int i = 0; i < cNum.length; i++) {
			sumN += cNum[i] - '0';
		}
		System.out.println("N합 : " + sumN);
		
		
		
		// N다음으로 큰 값 구하기
//		int next = N+1;
//		String sNext = String.valueOf(next);
//		char[] cNext = sNext.toCharArray();
//		System.out.println("next : " + cNext);
//		
//		int sumNext = 0;
//		for(int j = 0; j < cNext.length; j++) {
//			sumNext += cNext[j] - '0';
//		}
//		System.out.println("next합 : " + sumNext);
//		
//		// next와 N값의 합이 같으면 next출력
//		if(sumN == sumNext) {
//			System.out.println("답" + next);
//		} else {
//			// 다르면 다음값(N+2) 다시 비교(반복)
//			N++;
//		}
		
		
		
		
		int next = 0;
		int sumNext = 0;
		
		do {
			
			next = N+1;
			String sNext = String.valueOf(next);
			char[] cNext = sNext.toCharArray();
			
			System.out.println("next : " + next);
			
			sumNext = 0;
			for(int j = 0; j < cNext.length; j++) {
				sumNext += cNext[j] - '0';
			}
			
			System.out.println("next합 : " + sumNext);
		
			// 다르면 다음값(N+2) 다시 비교(반복)
			N++;
			
		} while (sumN != sumNext);
			// next와 N값의 합이 같으면 next출력
			System.out.println("답" + next);

	}

}
