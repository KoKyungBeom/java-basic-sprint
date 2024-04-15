package javabasic;

import java.util.Scanner;
import java.util.Arrays;

public class Example10 {
    public static void main(String[] args) {
        //사용자로부터 5명의 학생의 점수를 입력받아 배열에 저장한 다음 평균 점수를 계산하여 출력하세요

        //사용자로부터 입력받는 점수를 넣을 변수 5개 선언
        int score1;
        int score2;
        int score3;
        int score4;
        int score5;
        //사용자가 입력할 수 있도록 스캐너 생성
        Scanner scanner = new Scanner(System.in);
        //사용자가 입력한 수를 넣을수 있는 배열을 생성
        int[] scores = new int[5];
        //사용자가 입력한 5개의 수가 배열안에 들어가도록함
        for(int i = 0; i < scores.length;i++){
            scores[i] = scanner.nextInt();
        }
        //이렇게하고 나서 생각해보니 score 변수가 필요가 없네연 쓰지 않겠읍니다...
        //사용자가 입력한 배열안에 값을 합을 담을 변수와 평균값을 담을 변수 선언;
        int sum = 0;
        int average;
        //배열안에 숫자를 순회하며 합을 구하고 5로 나눠서 average에 할당
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        average = sum/5;
        //구한 평균값 출력
        System.out.println(average);
    }
}
