package javabasic;

public class Example12 {
    public static void main(String[] args) {

        Person male = new Person("화난복어",6);
        Person female = new Person("화난상어",4);

        System.out.println("이름 : " + male.name + " 나이 : " + male.age);
        System.out.println("이름 : " + female.name + " 나이 : " + female.age);

        Book one = new Book("혼자 공부하는 자바"," 신용권"," 28000원");
        one.bookInformation("혼자 공부하는 자바"," 신용권"," 28000원");
    }
}
