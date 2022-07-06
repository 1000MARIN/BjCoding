package Bj3;

import java.util.Random;

public class RandomJava {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        random.setSeed(System.currentTimeMillis());

            System.out.println("n 미만의 랜덤 정수 리턴 : " + random.nextInt(10));
            System.out.println("무작위 boolean 값 : " + random.nextBoolean());
            System.out.println("무작위 long 값 : " + random.nextLong());
            System.out.println("무작위 float 값 : " + random.nextFloat());
            System.out.println("무작위 double 값 : " + random.nextDouble());
            System.out.println("무작위 정규 분포의 난수 값 :" + random.nextGaussian());

    }
}
