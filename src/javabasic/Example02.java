package javabasic;

public class Example02 {
    public static void main(String[] args) {
        //두개의 int 변수를 선언하고 이들의 합,차,곱,나눗셈의 결과를 출력하세요

        //두개의 변수를 선언
        int number1;
        int number2;
        //변수에 값을 할당
        number1 = 36;
        number2 = 18;
        //두개의 수를 연산한 값을 출력
        System.out.println("두수의합은 " + number1+number2);
        System.out.println("두수의차는 " + (number1-number2));
        System.out.println("두수의곱은 " + number1*number2);
        System.out.println("두수의나누기는 " + number1/number2);
    }
}
