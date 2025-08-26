public class ThrowDemo {
    public static void main(String[] args) {
        int res = div(10,2);
        System.out.println(res);
        int id = div(10,0);

    }

    public static int div(int d,int di)
    {
        if(di == 0)
            throw new ArithmeticException("Can't divide by zero");
        else return d/di;
    }
}
