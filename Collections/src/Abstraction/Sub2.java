package Abstraction;

public class Sub2 extends AbstractDemo{
    @Override
    public void calculate(double x) {
        System.out.println("Square root of " +x+" is: "+Math.sqrt(x));
    }
}
