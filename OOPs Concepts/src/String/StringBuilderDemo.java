package String;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Yeah");
        System.out.println(sb);
        System.out.println(sb.hashCode());
        StringBuilder sc = sb.append("Wah");
        System.out.println(sc);
        System.out.println(sc.hashCode());
    }
}
