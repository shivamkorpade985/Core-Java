public class ATM {
    //Data hiding
    private int bal = 45000;
    private String location ="Phaltan";
    private String bankName = "SBI";
    private int Acctnum = 22478;

    public int getbal()
    {
        return bal;
    }

    public int getAcctnum()
    {
        return Acctnum;
    }

    private void details()
    {
        System.out.println(location);
    }
//Data binding
}