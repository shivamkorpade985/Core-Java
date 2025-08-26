import java.io.File;
import java.util.Scanner;

public class CheckedExp{
    public static void main(String[] args) {
       //To handle exception use this..
        try{
            System.out.println("calculating");
            System.out.println("calculating");
            System.out.println("calculating");

          File file  = new File("sss.txt");
          Scanner sc = new Scanner(file);
            System.out.println("calculated");
        }
        catch (Exception e)
        {
            System.out.println("Catch Working");
            System.out.println(e);

        }
        System.out.println("sss");
        System.out.println("ssss");
    }
}
