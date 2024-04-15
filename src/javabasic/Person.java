package javabasic;

public class Person {
        //Person클래스를 생성하고 이름과 나이를 필드로 가지게 하세요
        String name;
        int age;
        //해당 클래스에는 이름과 나이를 설정할 수 있는 생성자와 이를 출력하는 메서드를 포함하세요
        public Person(String name,int age){
                this.name = name;
                this.age = age;
        }
        public void informationPrint(String str,int num){
                System.out.println("이름은 " + name + "입니다.");
                System.out.println("나이는 " + age + "입니다.");

        }
}
