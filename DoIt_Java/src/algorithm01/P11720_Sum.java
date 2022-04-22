package algorithm01;

import java.util.Scanner;

public class P11720_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 숫자의 개수
		String sNum = sc.next(); // 입력받은 N개의 숫자들
		char[] cNum = sNum.toCharArray(); // char 배열로 변환
	
		int sum = 0; // 합계
		for (int i = 0; i < cNum.length; i++) {
			sum += cNum[i] - '0'; // 정수형으로 변환
		}
		System.out.println(sum);
		

	}

}
