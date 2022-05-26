package Bj2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadrant {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        bf.close();
        System.out.println(a);
        System.out.println(b);
//        System.out.println(a+b);
//        if (x > 0 && y > 0) {
//            System.out.println("1");
//        } else if (x < 0 && y > 0) {
//            System.out.println("2");
//        } else if (x < 0 && y < 0) {
//            System.out.println("3");
//        } else {
//            System.out.println("4");
//        }
    }
}
