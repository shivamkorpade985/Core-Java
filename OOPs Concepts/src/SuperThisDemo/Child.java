package SuperThisDemo;

public class Child extends Parent{
    String name = "Shivam";

    public static void main(String[] args) {
        Child ob = new Child();
        ob.details();
    }
    public void details()
    {
        System.out.println("Older Child "+name);
        this.name = "Soham";
        System.out.println("Younger Child "+name);

        super.details();
         super.name = "Govind";
        System.out.println(super.name);


    }
}
