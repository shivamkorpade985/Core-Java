class MyRunnable2 implements Runnable{

    public void run(){
        for (int i = 0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName() + i+" Ladki Pasand");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
    }


}
public class JoinDemo {

    public static void main(String[] args) throws InterruptedException {
    MyRunnable2 m = new MyRunnable2();
    //creating a thread by runnable instance
    Thread t = new Thread(m);
    //starting a thread
        t.start();
        t.join(); //it only continues when the chil (started method) is completed their execution seccessfully

        System.out.println("Print Cards");


    }
}
