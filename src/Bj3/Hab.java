package Bj3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hab {

	public static void main(String[] args) throws IOException{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		br.close();
		
		int sum = 0;
		for (int i = 0; i < a +1; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}