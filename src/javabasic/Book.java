package javabasic;

public class Book {
    String title;
    String author;
    String price;

    public Book(String title, String author, String price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void bookInformation(String str1,String str2,String str3){
        title = str1;
        author = str2;
        price = str3;

        System.out.println(str1+str2+str3);
    }
}
