package practice;

import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 가로길이 1 ~ n / 높이 n
		
		// 세로
		for(int i=0; i<n; i++) {
			// 가로
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
