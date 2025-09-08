import javax.sound.midi.Soundbank;

class MyRunnable implements Runnable{
    public void              (){
        for(int i = 0;i<5;i++)
        {
            System.out.println("Child Thread"+i);
        }
    }

}

public class MTproject2 {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        for (int i = 0;i<5;i++){
            System.out.println("Main Thread"+i);
        }
    }
}
