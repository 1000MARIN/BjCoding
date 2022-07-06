package Bj3;

public class Test {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=i; j++) {
				sb.append("*");
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

}
