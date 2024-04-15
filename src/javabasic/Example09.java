package javabasic;

public class Example09 {
    public static void main(String[] args) {
        //10개의 정수 값을 저장할 수 있는 배열을 생성하고 1부터 10까지의 값을 배열에 저장한후 이를 출력하세요

        //10개의 정수값을 저장할 수 있는 배열을 생성
        int[] arr = new int[10];
        //1~10의 값을 배열에 저장하려면 배열을 순회하며 index가 n일때 n+1값이 들어가서 출력
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
            System.out.println(arr[i]);
        }
    }
}
