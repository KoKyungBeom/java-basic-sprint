package javabasic;

import java.util.Scanner;

public class Example05_01 {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;

        Scanner scanner = new Scanner(System.in);

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        int maxNumber;

        if(num1 > num2){
            maxNumber = num1;
        }
        else{
            maxNumber = num2;
        }
        if(maxNumber < num3){
            maxNumber = num3;
        }

        int minNumber;

        if(num1 > num2){
            minNumber = num2;
        }
        else{
            minNumber = num1;
        }
        if(minNumber > num3){
            minNumber = num3;
        }

        System.out.println("가장 큰값은 " + maxNumber + " 가장 작은값은 " + minNumber + "입니다.");
    }
}
