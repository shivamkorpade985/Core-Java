package Abstraction;

public class TestCar {
    public static void main(String[] args) {
        Maruti m = new Maruti(5001);
        Santro s = new Santro(5215);

        Car ref;

        ref = m;
        System.out.println("Registration Number of Maruti car is :"+m.regNo);
        m.steering(1,150);
        m.breaks(500);

        ref = s;
        System.out.println("Registration Number of Santro car is :"+s.regNo);
        s.steering(2,145);
        s.breaks(450);

    }
}
