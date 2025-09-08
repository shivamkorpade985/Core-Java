import static java.lang.Thread.sleep;

class Mythread3 extends Thread{
    public void run(){
        for (int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + i);

            Thread.yield(); //it will give up and take the chance to other threads to execute
        }
    }

}
public class YeildDemo {
    public static void main(String[] args) throws InterruptedException {
        Mythread3 t1 = new Mythread3();
        t1.start();

        Thread.sleep(3000);
        for (int i = 0;i<10;i++){
            System.out.println("main thread "+i);
        }
    }
}
