// Parent class
abstract class Payment {
    abstract void pay();
}

// Child classes
class CreditCard extends Payment {
    void pay() {
        System.out.println("Payment done using Credit Card.");
    }
}

class DebitCard extends Payment {
    void pay() {
        System.out.println("Payment done using Debit Card.");
    }
}

class BHIMUPI extends Payment {
    void pay() {
        System.out.println("Payment done using BHIM UPI.");
    }
}

// Payment Gateway
class PaymentGateway {
    static void paymentMethod(Payment p) {
        p.pay();  // runtime polymorphism
    }
}

// Main Class
public class MainClass7 {
    public static void main(String[] args) {
        PaymentGateway.paymentMethod(new CreditCard());
        PaymentGateway.paymentMethod(new DebitCard());
        PaymentGateway.paymentMethod(new BHIMUPI());
    }
}