public class FinallyDemo2 {
    public static void main(String[] args) {
        m1();
    }

    public static void m1()
    {
        try{
            System.out.println("Try block");
            return;
        } catch (Exception e) {
            System.out.println("Catch Block");
        }
        finally { //100% execute no matter return is appeared
            System.out.println("Finally block");
        }
    }
}
