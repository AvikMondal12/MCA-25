import java.util.Scanner;

// Payment interface
interface Payment {
    double LIMIT = 100000;     // interface constant
    void pay(double amount);
}

// Refund interface
interface Refund {
    void refund(double amount);
}

// Card Payment
class CardPayment implements Payment, Refund {
    public void pay(double amount) {
        if(amount <= LIMIT)
            System.out.println("Card Payment Successful: ₹" + amount);
        else
            System.out.println("Amount exceeds limit!");
    }

    public void refund(double amount) {
        System.out.println("Refund to Card: ₹" + amount);
    }
}

// Wallet Payment
class WalletPayment implements Payment, Refund {
    public void pay(double amount) {
        System.out.println("Wallet Payment Successful: ₹" + amount);
    }

    public void refund(double amount) {
        System.out.println("Refund to Wallet: ₹" + amount);
    }
}

// UPI Payment
class UPIPayment implements Payment, Refund {
    public void pay(double amount) {
        System.out.println("UPI Payment Successful: ₹" + amount);
    }

    public void refund(double amount) {
        System.out.println("Refund via UPI: ₹" + amount);
    }
}

// Main class
public class PaymentGateway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Card  2.Wallet  3.UPI");
        System.out.print("Choose Payment Mode: ");
        int choice = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        Payment p = null;
        Refund r = null;

        switch(choice){
            case 1: p = new CardPayment(); r = new CardPayment(); break;
            case 2: p = new WalletPayment(); r = new WalletPayment(); break;
            case 3: p = new UPIPayment(); r = new UPIPayment(); break;
            default: System.out.println("Invalid Choice"); return;
        }

        p.pay(amount);
        r.refund(amount);

        sc.close();
    }
}