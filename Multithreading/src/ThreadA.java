public class ThreadA{
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo5 t1 = new ThreadDemo5();
        t1.start();

        synchronized (t1){
            System.out.println("Main Thread calling wait()......");
            t1.wait();
            System.out.println("Main thread got notification..");

        }

    }
}

class ThreadDemo5 extends Thread{
    int sum = 0;
    public void run(){

        synchronized (this){
            int sum = 0;
            for (int i = 0;i<10;i++){
                sum = sum + i;

            }
            System.out.println("Sum = "+sum);
            System.out.println("Child thread will give you notification");
            this.notify();
        }

    }
}
