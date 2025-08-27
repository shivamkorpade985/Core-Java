package Poly;

public class Notification extends Wish{
    String name = "Shivam";
    public static void main(String[] args) {
        Notification notification = new Notification();
        notification.notifyUser();

        notification.greet();
    }

    public  void greet(){
        System.out.println("Hello"+name);
    }
    public  void notifyUser(){

        System.out.println("Today is the Gudipadwa");
    }

}
