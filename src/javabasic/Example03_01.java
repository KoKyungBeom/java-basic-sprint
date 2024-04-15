package javabasic;

import java.util.Scanner;

public class Example03_01 {
    public static void main(String[] args) {
        //Example03 심화학습
        //이름에 문자열 말고 숫자가 들어오면 오류 출력
        //입력받은 문자열 name에 index를 순회하면서 숫자가 발견된다면
        //false를 반환하여 false가 반환될 경우 오류 메시지를 출력
        //나이에 입력받은 문자열 age에 index를 순회하면서 숫자가아닌 문자가 발견된다면
        //false를 반환하여 false가 반환될 경우 오류 메시지를 출력

        //Scanner 클래스에서 scanner라는 객체를 생성
        Scanner scanner = new Scanner(System.in);

        //사용자의 이름은 받는 변수 name 과 나이를 받는 변수 age를 만들고 scanner를 통해 입력 받기
        String name = scanner.nextLine();
        String age = scanner.nextLine();

        //이름과 나이의 오류를 검증하는 boolean변수를 생성
        boolean nameValid;
        boolean ageValid;

        //만들어둔 변수가 오류를 검증하는 메소드를 통해 할당 받도록함
        nameValid = isValidName(name);
        ageValid = isValidAge(age);

        //조건문을 만들어 오류를 검증하는 메소드에서 할당 받은 값이 false일경우 오류 메시지를 출력하고
        //true일 경우 이름과 나이를 알려주는 메시지를 출력
        if(!nameValid){
            System.out.println("잘못된 이름을 입력하셨어연");
        }
        else{
            System.out.println("사용자의 이름은 " + name + "입니다.");

        }
        if(!ageValid){
            System.out.println("잘못된 나이를 입력하셨어연");
        }
        else {
            System.out.println("사용자의 나이는 " + age + "살입니다.");
        }
    }
    //str이 "가나다6" 라고 가정하면
    //char c는 '가','나','다','6'이 되고
    //lookUpTable.indexof('가'),lookUpTable.indexof('나')
    //lookUpTable.indexof('다'),lookUpTable.indexof('6')
    //lookUpTable.indexof('가')는 '가'라는 문자가 없기때문에 -1을 반환
    //lookUpTable.indexof('나')는 '나'라는 문자가 없기때문에 -1을 반환
    //lookUpTable.indexof('다')는 '다'라는 문자가 없기때문에 -1을 반환
    //lookUpTable.indexof('6')는 '6'라는 문자가 있기때문에 6의 index인 5를 반환
    //결국 -1이 아닌경우가 생겨서 false를 반환
//    public static boolean isValidName(String str){
//        String lookUpTable = "1234567890";
//        for(char c:str.toCharArray()){
//            if(lookUpTable.indexOf(c) != -1){
//                return false;
//            }
//        }
//        return true;
//    }
    public static boolean isValidName(String str){
        String lookUpTable = "1234567890";
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < lookUpTable.length(); j++){
                if(str.charAt(i) == lookUpTable.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
    //str이 "30살" 라고 가정하면
    //char c는 '3','0','살'이 되고
    //lookUpTable.indexof('3'),lookUpTable.indexof('0'),lookUpTable.indexof('살')
    //lookUpTable.indexof('3')는 '3'인 문자가 있기때문에 3의 index인 2를 반환
    //lookUpTable.indexof('0')는 '0'인 문자가 있기때문에 0의 index인 9를 반환
    //lookUpTable.indexof('살')는 '살'인 문자가 없기때문에 -1을 반환
    //결국 숫자만 와야하는 문자열에 -1이 반환나온다면 false를 반환
    public static boolean isValidAge(String str){
        String lookUpTable = "1234567890";
        for(char c : str.toCharArray()){
            if(lookUpTable.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }
}
