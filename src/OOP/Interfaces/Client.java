package OOP.Interfaces;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int input;
        int amt = 55000;
        PaymentProcess pp;
        System.out.println("Choose an option... 1 for DC | 2 for CC | 3 for QR code");
        Scanner scn = new Scanner(System.in);
        input=scn.nextInt();
        if(input==1){ //constructor injection
            pp = new PaymentProcess(new DebitCard());
            pp.initiatePayment(amt);
        }
        else if(input==2){
            pp = new PaymentProcess(new CreditCard());
            pp.initiatePayment(amt);
        }
        else if(input==3){ //Setter injection
            pp = new PaymentProcess();
            pp.setPay(new QRCode());
            pp.initiatePayment(amt);
        }
    }
}
