package javabasic;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        //세 개의 다른 정수 값들을 비교하여 가장 큰 수와 가장 작은 수를 결정하는 프로그램을 작성하세요

        //할당 받은 세 개의 정수 값들을 비교해야함 그리고 제일 큰 수,제일 작은 수를 출력해야함
        //세 수를 비교하는 방법은 뭐가있을까?
        //num1,num2,num3가 있다면 num1,num2,num3를 경우의 따라 나눠서 비교한뒤
        //가장 큰 값이 출력되는 메소드를 만들고 그값을 최대값이라는 변수에 할당한뒤 출력
        //가장 작은 값도 반대되는 메소드를 만들고 그값을 최소값이라는 변수에 할당한뒤 출력

        //사용자로부터 세 개의 수를 입력 받아야 하기 때문에 세 개의 변수를 생성
        int num1, num2, num3;
        //사용자가 입력할 수 있도록 스캐너를 생성
        Scanner scanner = new Scanner(System.in);
        //변수에 사용자가 입력한 수를 받도록 할당
        System.out.println("세 개의 정수를 입력해주세요");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        //할당 받은 세 개의 정수 값들을 비교해야함 그리고 제일 큰 수,제일 작은 수를 출력해야함
        //가장 큰 수 를 구하는 메소드,가장 작은 수 를 구하는 메소드를 만든다

        //가장 큰 수,작은 수 가 들어갈 수 있는 변수를 만든다
        int bigNum,smallNum;

        //메소드에 사용자가 입력한 정수가 들어가게하고 결과값이 변수에 할당 되도록 한다
        bigNum = maxNum(num1,num2,num3);
        smallNum = minNum(num1,num2,num3);
        //가장 큰 수,작은 수를 출력한다
        System.out.println("세 정수 중 가장 큰 값은 " + bigNum + "입니다.");
        System.out.println("세 정수 중 가장 작은 값은 " + smallNum + "입니다.");

    }
    public static int maxNum(int num1, int num2, int num3) {
        int result = num1;
        if (num1 > num2) {
            if (num1 > num3) {
                return result;
            } else {
                return num3;
            }
        } else if (num1 < num2) {
            if (num2 < num3) {
                return num3;
            } else {
                return num2;
            }
        } else {
            if (num1 > num3) {
                return result;
            }
        }
        return num1;
    }
    public static int minNum(int num1, int num2, int num3) {
        int result = num1;
        if (num1 < num2) {
            if (num1 > num3) {
                return num3;
            } else {
                return num1;
            }
        } else if (num1 > num2) {
            if (num2 < num3) {
                return num2;
            } else {
                return num3;
            }
        } else {
            if (num1 > num3) {
                return num3;
            }
        }
        return num1;
    }
}
