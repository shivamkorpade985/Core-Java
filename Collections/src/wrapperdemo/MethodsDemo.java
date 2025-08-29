package wrapperdemo;

public class MethodsDemo {

    public static void main(String[] args) {
        String a = "1212";
        int b = Integer.parseInt(a); //parse string to int
        System.out.println(b);

        int aa = 12;
        String bb = Integer.toString(aa);
        System.out.println("String is: "+aa);

        Integer c = 17 ;
        Integer d = 15;

        System.out.println("Compare "+Integer.compare(c,d));

        Integer res = Integer.valueOf(120);
        System.out.println(res);

        Boolean bol = true;

        System.out.println(bol);
    }
}
