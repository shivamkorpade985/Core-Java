package TypeofVariable;

public class StaticDemo {
    static String name = "Shivam"; //static-instance

    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        System.out.println("Before change");
        System.out.println(ob1.name);

        StaticDemo ob2 = new StaticDemo();
        ob2.name = "Atharv";

        System.out.println("-------------------");
        System.out.println(ob2.name);
        System.out.println("After update");
        System.out.println(ob1.name); //Important Step;

    }
}
