package Abstraction;

public abstract class Car{
    int regNo;

    Car(int r){
        regNo = r;
    }

    public abstract void steering(int direction,int angle);

    public abstract void breaks(int force);
}
