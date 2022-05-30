package Bj3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nprint {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int i = 1;
		StringBuilder sb = new StringBuilder();
		
		while(i<= N) {
			sb.append(i + "\n");
			i++;
		}	
		System.out.println(sb);
	}
}
