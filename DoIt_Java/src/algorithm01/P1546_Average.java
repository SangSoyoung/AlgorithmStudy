package algorithm01;

import java.util.Scanner;

public class P1546_Average {

	public static void main(String[] args) {
		// 과목갯수 입력받기
		Scanner sc = new Scanner(System.in);
		int N = 0;
		N = sc.nextInt();
		int[] arr = new int[N];
		
		// 갯수만큼 성적입력받기
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		long max = 0; //최대값
		long sum = 0; //총점

		for(int j = 0; j < arr.length; j++) {
			
			if(max < arr[j]) { // 최대값 찾기
				max = arr[j]; 
			}
			sum = sum + arr[j]; // 총점 구하기
		}
		
		// sum*100/max/n 출력
		System.out.println(sum * 100.0 / max / N);
	}
}
