public class FinallyDemo3 {
    public static void main(String[] args) {
        int res = m1();
        System.out.println(res);
    }

    public static int m1()
    {
        try{
            System.out.println("Try block");
            System.exit(0);//Here JVM will be shuted down
            return 10;

        } catch (Exception e) {
            System.out.println("Catch Block");
            return 55;
        }
        finally { //100% execute no matter return is appeared
            System.out.println("Finally block");
            return 20;
        }
    }
}

