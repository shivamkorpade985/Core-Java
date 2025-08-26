package MethodDemo;

import Modifiers.ProtectedDemo;

public class TypesOfMethods extends ProtectedDemo{

    public static void main(String[] args) {
        print(); //1
        int s = samosa(); //2
        System.out.println(s);

        display("Shivam");//3

        int b = brain(10,20);//4
        System.out.println(b);

    }
    //method with no return and with no parameter
    public static void print()
    {
        System.out.println("Hello Bhaiya");
    }

    //method with  return and with no parameter
    public static int samosa()
    {
        return 2;
    }

    //method with  return and with no parameter
    public static void display(String name)
    {
        System.out.println(name);
    }
    //method with return and with parameter
    public static int brain(int num1,int num2)
    {
        return num1 + num2;
    }

}
