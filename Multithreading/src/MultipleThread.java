class Mythread4 extends Thread{
    SyncDemo s = new SyncDemo();
    public void run(){
        s.m1();
    }
}

class SyncDemo{
    int[] arr = {1,2,3,4,5};
    int sum = 0;
    public synchronized void m1() {
        synchronized (SyncDemo.class) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                sum = sum + arr[i];
            }
            System.out.println("Sum= " + sum);
        }
    }

}
public class MultipleThread {
    public static void main(String[] args) {
        Mythread4 t1 = new Mythread4();
        Mythread4 t2 = new Mythread4();
        t1.start();
        t2.start();

    }
}
