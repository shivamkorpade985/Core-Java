package TypeofVariable;

public class InstanceDemo {
    String name = "Shivam"; //instance variable
                    //It is the default variable
    public static void main(String[] args) {
        InstanceDemo ob1 = new InstanceDemo();

        System.out.println(ob1.name);

        ob1.name = "Advait";
        System.out.println(ob1.name);

        System.out.println("-----------------------------");
        InstanceDemo ob2 = new InstanceDemo();
        System.out.println(ob2.name);
        ob2.name = "Atharv";
        System.out.println(ob2.name);
    }
}
