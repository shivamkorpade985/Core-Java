import Abstraction.Sub1;
import Abstraction.Sub2;
import Abstraction.Sub3;

public class TestCalc {
    public static void main(String[] args) {
        Sub1 ob1  =new Sub1();
        Sub2 ob2 = new Sub2();
        Sub3 ob3 = new Sub3();

        ob1.calculate(5);
        ob2.calculate(25);

        ob3.calculate(5);



    }
}
