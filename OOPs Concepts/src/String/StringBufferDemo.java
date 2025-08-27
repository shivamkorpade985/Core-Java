package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        String name = "Shivam";
        System.out.println(name);
        System.out.println(name.hashCode());

        name = "Sho";
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("----------------------------------------");

        StringBuffer fname = new StringBuffer("Soham");
        System.out.println(fname);
        System.out.println(fname.hashCode());

        StringBuffer fnames = fname.append("Shivam");
        System.out.println(fnames);
        System.out.println(fname.hashCode());




    }
}
