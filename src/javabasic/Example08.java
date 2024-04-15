package javabasic;

import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        //사용자로부터 숫자n을 입력받아 1부터 n까지의 합을 계산하여 출력하는 프로그램을 작성하세요

        //사용자로부터 숫자를 입력받는 변수 선언
        int num;
        //사용자가 입력 할 수 있도록 스캐너 생성
        Scanner scanner = new Scanner(System.in);
        //입력받은 수를 변수에 할당
        num = scanner.nextInt();
        //1부터 n까지의 합을 계산하고 출력해야하니 합을 담을 변수 선언 초기값을 0으로 설정해줘야함
        int sum = 0;
        //1부터 n까지 순회하며 더한뒤 sum에 할당
        for(int i = 1; i <= num; i++){
            sum = sum + i;
        }
        //할당받은 sum을 출력
        System.out.println(sum);
    }
}
