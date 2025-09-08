public class PrioDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        Thread t3 = new Thread(new MyRunnable());

        System.out.println("Main Thread Prioriy: "+Thread.currentThread());
        System.out.println("t1 Thread Priority: "+t1.getPriority());
        System.out.println("t2 Thread Priority: "+t2.getPriority());

        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);

        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("t1 Thread Priority: "+t1.getPriority());
    }
}
