package packageA;


public class Parent {
    protected static int staticVar = 100;
    protected int instanceVar = 200;

    protected static void staticMethod() {
        System.out.println("Parent's static method");
    }

    protected void instanceMethod() {
        System.out.println("Parent's instance method");
    }
}

