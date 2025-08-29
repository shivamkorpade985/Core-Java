package Abstraction;

public class Sub1 extends AbstractDemo{
    @Override
    public void calculate(double x) {
        System.out.println(x+"Square is: "+(x*x));
    }
}
