package javabasic;

public class Example11 {
    public static void main(String[] args) {
        //주어진 정수 배열에서 최댓값과 최솟값을 찾아 출력하는 프로그램을 작성하세요

        //주어진 정수 배열 = 사용자가 입력? 내가 입력?
        int[] arr = {5,5,6,7,8,8,9,12,12,56,51,42};

        //배열에서 최댓값과 최솟값을 찾는 방법은?
        //기준값을 정한뒤 배열을 순회하면서 비교한뒤 더 큰값이 나오면 갱신해서 최댓값을 구함
        //기준값을 정한뒤 배열을 순회하면서 비교한뒤 더 작은값이 나오면 갱신해서 최솟값을 구함

        //최댓값,최솟값을 받을 변수를 선언
        int arrmax;
        int arrmin;
        //어차피 변수안에 값을 비교 하기때문에 기본값을 배열의 인덱스 0번으로 할당
        arrmax = arr[0];
        arrmin = arr[0];

        for(int i = 0; i < arr.length;i++){
            if(arrmax < arr[i]){
                arrmax = arr[i];
            }
        }
        for(int i = 0; i < arr.length;i++){
            if(arrmin > arr[i]){
                arrmin = arr[i];
            }
        }
        System.out.printf("위 배열의 최댓값은 %d 최솟값을 %d 입니다",arrmax,arrmin);
    }
}