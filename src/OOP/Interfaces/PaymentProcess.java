package OOP.Interfaces;

public class PaymentProcess {


    IPay pay;

    PaymentProcess(){

    }

    PaymentProcess(IPay pay){
        this.pay = pay;
    }

    public void setPay(IPay pay) {
        this.pay = pay;
    }

    public void initiatePayment(int amt){
        boolean status = pay.payBill(amt);
        if(status)
            System.out.println("Payment Successful");
        else
            System.out.println("Payment failed");
    }
}
