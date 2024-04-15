package javabasic;

public class StringUtil {

    //StringUtill 클래스를 생성하세요.이 클래스는 문자열 처리와 관련된 다양한
    //기능을 제공하는 유틸리티 메서드를 포함할 것 입니다.

    //StringUtill클래스 안의 메소드 3가지
    //reverse 메소드는 하나의 String을 매개변수로 받아 그 문자열을 뒤집은 결과를 반환합니다
    //객체를 생성하지않고 메소드를 사용할 수 있도록 클래스 메소드로 구현
    //문자열을 받고 문자열을 반환해야하니 String 타입으로 반환
    //받은 문자열을 거꾸로 반환해야하니 받은 String의 인덱스를 반대로 순회하며 더한뒤 새로운 문자열 생성
    //결과값을 반환
    public static String reverse(String str){
        String result = "";

        for(int i = str.length()-1; i >= 0; i--) {
           result += str.charAt(i);
        }
        return result;
    }
    //concat 메소드는 두개의 String을 매개변수로 받아 이를 연결한 결과를 반환합니다
    //객체를 생성하지않고 메소드를 사용할 수 있도록 클래스 메소드로 구현
    //문자열을 받고 문자열을 반환해야하니 String 타입으로 반환
    //문자열 두개를 받고 이를 연결해야하니 두개의 String의 인덱스를 순회하며 더한뒤 새로운 문자열을 반환
    //결과값을 반환
    public static String concat(String str1,String str2){
        String result = "";
        result = str1 + str2;
        return result;
    }
    //세 개의 문자열을 받을때 메소드
    public static String concat(String str1,String str2,String str3){
        String result = "";
        result = str1 + str2 + str3;
        return result;
    }
    //contains 메소드는 하나의 String과 하나의 문자를 매개변수로 받아 주어진 문자열이 해당 문자를 포함하는지 여부를 반환합니다
    //객체를 생성하지않고 메소드를 사용할 수 있도록 클래스 메소드로 구현
    //받은 문자열 안에 받은 문자가 있는지 확인하고 있다면 true 없다면 false boolean 타입으로 반환
    //받은 String의 인덱스를 순회하며 받은 문자와 같다면 true를 반환 없다면 false를 반환
    //결과값을 반환
    public static boolean contains(String str, char word){
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) == word){
                return true;
            }
        }
        return false;
    }
}
