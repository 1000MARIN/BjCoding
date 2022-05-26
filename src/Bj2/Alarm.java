package Bj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alarm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int h = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        br.close();

        if (m < 45) {
            h--;
            m = 60 - (45 - m);
            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        } else {
            System.out.println(h + " " + (m - 45));
        }
    }
}
