package javabasic;

import java.util.Scanner;

public class Example05_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numberArr = new int[3];

        for(int i = 0; i < 3; i++){
            numberArr[i] = scanner.nextInt();
        }

        int maxNumber = numberArr[0];
        int minNumber = numberArr[0];

        for (int i = 1;i < numberArr.length; i++) {
            maxNumber = Math.max(maxNumber, numberArr[i]);
            minNumber = Math.min(minNumber, numberArr[i]);
        }
        System.out.println("가장 큰값은 " + maxNumber + " 가장 작은값은 " + minNumber + "입니다.");
    }
}
