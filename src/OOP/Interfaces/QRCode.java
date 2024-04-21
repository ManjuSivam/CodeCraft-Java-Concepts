package OOP.Interfaces;

public class QRCode implements IPay{
    public boolean payBill(int amount ){
        System.out.println("Payment of Rs."+amount+" done using QR Code ");
        return true;
    }
}
