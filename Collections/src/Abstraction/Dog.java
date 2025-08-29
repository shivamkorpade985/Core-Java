package Abstraction;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sound() {
        System.out.println("Bho Bho");
    }
}
