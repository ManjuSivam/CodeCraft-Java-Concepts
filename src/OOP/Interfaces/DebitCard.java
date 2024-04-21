package OOP.Interfaces;

public class DebitCard implements IPay{
    public boolean payBill(int amount ){
        System.out.println("Payment of Rs."+amount+" done using Debit card ");
        return true;
    }
}
