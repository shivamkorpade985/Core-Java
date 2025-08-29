package wrapperdemo;

public class AutoBoxingDemo {
    public static void main(String[] args) {
        int a = 10;
        Integer i = a; //AutoBoxing
        System.out.println(i);

        int b= i;//Unboxing;
    }
}
