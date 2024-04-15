package javabasic;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        //사용자로부터 이름과 나이를 입력받아, 그 정보를 화면에 출력하는 간단한 프로그램을 작성하세요

        //이름과 나이를 입력받음
        //콘솔로 입력받아야하고 변수가 2개 필요함
        //이름은 문자열 나이는 숫자?
        //일단 숫자검증은 미루고 올바르게 받는것부터 구현

        //입력받을 이름과 나이를 변수 선언
        String name;
        int age;

        //Scanner 클래스에서 scanner라는 객체를 생성
        Scanner scanner = new Scanner(System.in);

        //name과 age를 scanner를 통해 입력 받기
        name = scanner.nextLine();
        age = scanner.nextInt();

        //입력받은 데이터를 출력
        System.out.println("사용자의 이름은 " + name +"\n사용자의 나이는" + age + "입니다.");
    }
}