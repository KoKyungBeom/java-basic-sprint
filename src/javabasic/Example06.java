package javabasic;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        //사용자로부터 숫자를 하나 입력받아 이 숫자가 양수인지 음수인지 아니면 0인지 판단하여 출력하는 프로그램을 작성하세요

        //사용자로부터 입력받는 숫자를 넣을 변수 선언
        int num;
        //사용자가 입력할 수 있도록 스캐너 생성
        Scanner scanner = new Scanner(System.in);
        //사용자가 입력한 수를 변수에 할당
        num = scanner.nextInt();
        //입력받은 수가 양수,음수,0일때를 나눠서 출력
        if(num > 0){
            System.out.println("입력하신 숫자는 양수입니다.");
        }
        else if(num < 0){
            System.out.println("입력하신 숫자는 음수입니다.");
        }
        else{
            System.out.println("입력하신 숫자는 0입니다.");
        }
    }
}
