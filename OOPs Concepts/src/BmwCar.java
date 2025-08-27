public class BmwCar {
    String color = "Black";
    String seats = "Five";
    int gears = 4;

    public static void main(String[] args) {
        BmwCar my = new BmwCar();
        my.mycar();
    }
    public  void mycar(){
        System.out.println("Color= "+color);
    }
}
