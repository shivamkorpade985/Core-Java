package String;

public class StringDemo {

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Shivam");
        StringBuffer sb2 = sb1.append("Korpade");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb1.hashCode());
        System.out.println(sb2.hashCode());

        StringBuilder sbb1 = new StringBuilder("Shivam");
        StringBuilder sbb2 = sbb1.append("Korpade");
        System.out.println(sbb1);
        System.out.println(sbb2);
        System.out.println(sbb1.hashCode());
        System.out.println(sbb2.hashCode());
        System.out.println(sbb1 == sbb2);
    }
}
