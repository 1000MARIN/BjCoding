package Bj3;

import java.io.IOException;
import java.util.Scanner;

public class AplusBminusthree1 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();	// 테스트 갯수
		int arr[] = new int[t];
		
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a + b;
		}
		sc.close();
		
		for (int k : arr) {
			System.out.println(k);
		}
	}
}