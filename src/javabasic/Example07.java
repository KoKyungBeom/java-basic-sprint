package javabasic;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        //1부터 100까지의 정수 중에서 짝수만 출력하는 프로그램을 작성하세요

        //1~100까지의 정수중에서 짝수만 담긴 문자열을 만들어서 문자열을 출력한다면?
        //1~100까지 정수중에서 짝수만 문자열에 담는 방법은?
        //1~100까지 순회하면서 짝수라면 문자열에 추가하면 짝수만 담긴 문자열 생성

        //짝수만 담을 문자열을 변수로 선언 초기화를 해줘야함
        String even = "";
        //1~100까지 순회하면서 짝수일 경우만 문자열로 추가
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                even = even + i;
            }
        }
        //1~100까지 순회하여 짝수만 담은 변수 even을 출력
        System.out.println(even);
    }
}
