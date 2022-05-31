package Bj3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CaseAplusB2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int a;
		int b;
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(a + b);
			sb.append('\n');
		}
		br.close();
		System.out.println(sb);
	}

}
