class ExceptionPrinting {
    public static void main(String[] args) {
        try{
            m1();
        }
        catch (Exception e){
//System.out.println(e.getMessage());
 System.out.println(e.toString());
//            e.printStackTrace();
        }
    }
    public static void m1(){
        m2();
    }
    public static void m2(){
        m3();
    }
    public static void m3(){
        m4();
    }
    public static void m4(){
//        throw new ArithmeticException("Divide by Zero");
        System.out.println(10/0);

    }

}
