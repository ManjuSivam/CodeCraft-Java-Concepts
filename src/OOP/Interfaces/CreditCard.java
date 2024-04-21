package OOP.Interfaces;

public class CreditCard implements IPay{
    public boolean payBill(int amount ){
        System.out.println("Payment of Rs."+amount+" done using Credit card ");
        return true;
    }
}
