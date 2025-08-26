import java.io.File;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        System.out.println("before Exception");
        System.out.println("calculating");


        try {

            File file = new File("Deo.text");
            Scanner sc = new Scanner(file);//Compile time becoz it is the checked
            //System.out.println(10 / 0);//termination of program happens here becoz of abnormal behaviour
            //runtime becoz it is the unchecked exception ;
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("ssss");
    }
}



