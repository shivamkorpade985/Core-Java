package Abstraction;

public class Sub3 extends AbstractDemo{
    @Override
    public void calculate(double x) {
        System.out.println(x+"Cube is: "+(x*x*x));
    }
}
