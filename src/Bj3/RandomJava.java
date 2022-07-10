package Bj3;

import java.util.Random;

public class RandomJava {
    public static void main(String[] args) {
        Random random = new Random();   // 객체 생성
        random.setSeed(System.currentTimeMillis());

//        System.out.println("n 미만의 랜덤 정수 리턴 : " + random.nextInt(10)); // 0부터 1까지의 랜덤한 숫자를 리턴
//        System.out.println("무작위 boolean 값 : " + random.nextBoolean());          // boolean 타입의 true, false 중 랜덤한 값을 리턴
//        System.out.println("무작위 long 값 : " + random.nextLong());                // Long 타입의 최소~최대 범위 안에서 랜덤한 숫자를 리턴
//        System.out.println("무작위 float 값 : " + random.nextFloat());              // Float 타입의 0 ~ 1 까지의 랜덤한 숫자를 리턴
//        System.out.println("무작위 double 값 : " + random.nextDouble());            // Double 타입의 0 ~ 1 까지의 랜덤한 숫자를 리턴
//        System.out.println("무작위 정규 분포의 난수 값 :" + random.nextGaussian());   // 평균이 0.0이고 표준편차가 1.0인 정규분포의 랜덤 숫자를 리턴

        int a[] = new int[6];   // int형 배열 선언

        System.out.print("중복 없이 뽑힌 6개의 숫자는 : ");
        for (int i = 0; i < 5; i++) {
            a[i] = random.nextInt(5) + 1;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    i--;
                }
            }
        }
        for (int k = 0; k <= 5; k++) {
            if (k == 5) {
                System.out.print(a[k]);
            } else {
                System.out.print(a[k] + ", ");
            }
        }
        System.out.print("입니다.");
    }
}
