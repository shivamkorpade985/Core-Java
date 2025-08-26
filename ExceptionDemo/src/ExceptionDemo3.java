import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        m1();
    }
    public static void m1() {
        try {
            m2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void m2() throws FileNotFoundException {
        m3();
    }
    public static void m3()throws FileNotFoundException {
        m4();
    }
    public static void m4() throws FileNotFoundException {

        File file = new File("name.txt");
        Scanner sc = new Scanner(file);
    }

}
