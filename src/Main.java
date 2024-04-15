import javabasic.StringUtil;

public class Main {
    public static void main(String[] args) {

        String test = StringUtil.reverse("asd");
        System.out.println(test);

        String test2 = StringUtil.concat("abc","defg");
        System.out.println(test2);

        boolean test3 = StringUtil.contains("abc",'f');
        System.out.println(test3);

    }

}