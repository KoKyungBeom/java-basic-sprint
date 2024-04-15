package javabasic;

public class Example01 {
    public static void main(String[] args) {
        /**
         * 다음 타입들을 가진 변수를 선언하고
         * 각에 적절한 값을 할당하세요
         * int,double,char,boolean,String
         */
        int number = 17;
        // Interger.MAX_VALUE = int가 표현할 수 있는 최댓값
        // 4바이트(1바이트는 8비트 2의 32승 까지 표현가능)
        int maxnumber = Integer.MAX_VALUE;
        int minnumber = Integer.MIN_VALUE;
        double number2 = 29.9;
        // char 타입은 자바에서는 유니코드로 변환 ('A'=65 'a'=97)
        char word = 'A';
        char word2 = 'a';
        boolean value = true;
        // String 클래스를 이미 자바에서 만들어둬서 charAt,indexof 같은 함수를 사용할 수 있음
        // charAt은 index를 매개변수로 받아 그 index값에 들어있는값을 알려주는 함수
        // indexof는 특정문자 char나 문자열을 받고 처음 발견되는 index를 알려주는 함수 찾지 못한다면 -1
        // 위의 함수 말고도 전부 대문자,소문자로 바꾸는 toUpperCase,toLowerCase 등 다양한 함수가 존재
        // 편리한 함수들을 알아두고 상황에 맞게 사용하면 좋다
        String str = "금요일 개꿀~";
        System.out.println(str.charAt(3));
        System.out.println(str.indexOf('금'));
    }
}
