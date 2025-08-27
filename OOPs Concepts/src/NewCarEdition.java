public class NewCarEdition extends BmwCar{
    public static void main(String[] args) {
        NewCarEdition cr = new NewCarEdition();
        cr.modifications();
    }
    public void modifications()
    {
        System.out.println("Old colour is:"+color);
        color = "Red";
        System.out.println("Modified color is:"+color);
    }

}
