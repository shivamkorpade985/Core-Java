package Abstraction;

public class Maruti extends Car{

     Maruti(int r) {
        super(r);
    }

    @Override
    public void steering(int direction, int angle) {
        System.out.println("Take a turn");
        System.out.println("Ordinary steering");
    }

    @Override
    public void breaks(int force) {
        System.out.println("Break appplied");
        System.out.println("Ordinary breaks");
    }
}
