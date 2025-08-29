package Abstraction;

public class Santro extends Car{

     Santro(int r) {
        super(r);
    }

    @Override
    public void steering(int direction, int angle) {
        System.out.println("Take a turn");
        System.out.println("Power steering");
    }

    @Override
    public void breaks(int force) {
        System.out.println("Break appplied");
        System.out.println("Hydrolic breaks");
    }
}
