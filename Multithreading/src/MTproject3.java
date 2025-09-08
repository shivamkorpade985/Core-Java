public class MTproject3 {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread(r);

        System.out.println("Main Thread name: "+Thread.currentThread());

        String t1name = t1.getName();
        System.out.println("Default name: "+t1name);

        t1.setName("My Thread");
        System.out.println("Now the name is: "+t1.getName());
    }
}
