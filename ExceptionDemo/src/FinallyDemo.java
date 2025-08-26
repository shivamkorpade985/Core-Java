public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
            System.out.println("try block");

        }
        catch (Exception e){

            System.out.println("Catch block");
        }
        finally {
            System.out.println("Finally block");
        }
    }
}
