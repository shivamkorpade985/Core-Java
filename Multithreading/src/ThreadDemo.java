class Mythread extends Thread{

    public void run(){
        for (int i = 0;i<5;i++) {
            System.out.println("Child Thread" + i);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {

        Mythread t = new Mythread();
        t.start();
        //t.run(); here program is executed but threading concept are not applied
        for (int i = 0; i < 5; i++) {
            System.out.println("Shivam" + i);
        }
    }
}
