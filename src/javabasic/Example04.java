package javabasic;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        //사용자로 부터 두개의 숫자를 입력받아 이들에 대한 덧셈,뺄셈,곱셈,나눗셈 나머지 연산의 결과를 출력하세요
        //두개의 숫자 모두 double타입의 값입니다 결과값도 double타입을 반환해야합니다
        //나눗셈에서 0으로 나눌 경우 나눌 수 없는 수라는 예외 메세지를 출력해야 합니다

        //사용자로부터 두개의 숫자를 입력 받아야하니 두개의 변수 선언
        double num1,num2;

        //사용자가 입력할 수 있도록 스캐너 생성
        Scanner scanner = new Scanner(System.in);

        //사용자로부터 num1,num2를 입력받아야함
        System.out.println("첫번째 수를 입력해주세요");
        num1 = scanner.nextDouble();
        System.out.println("두번째 수를 입력해주세요");
        num2 = scanner.nextDouble();

        //입력받은 숫자를 덧셈,뺄셈,곱셈 나눗셈,나머지 연산의 결과를 출력해야함
        System.out.printf("%f 더하기 %f는 %f 입니다.\n",num1,num2,num1+num2);
        System.out.printf("%f 빼기 %f는 %f 입니다.\n",num1,num2,num1-num2);
        System.out.printf("%f 곱하기 %f는 %f 입니다.\n",num1,num2,num1*num2);

        //하지만 나눗셈에서 나누는 값이 0이라면 오류 메시지를 출력해야함
        if(num2 == 0){
            System.out.println("나누는 값이 0입니다.");
        }
        //나누는 값이 0이 아니라면 나누기와 나머지 연산의 결과를 출력
        else{
            System.out.printf("%f 나누기 %f는 %f 입니다.\n",num1,num2,num1/num2);
            System.out.printf("%f 를 %f 나눈 나머지는 %f 입니다. ",num1,num2,num1%num2);
        }
    }
}
