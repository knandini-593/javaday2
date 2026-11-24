interface PaymentGateway {
    void makePayment();
}

class GooglePay implements PaymentGateway {
    public void makePayment() { 
        System.out.println("Payment completed using Google Pay");
     }
}

class PhonePe implements PaymentGateway {
    public void makePayment() { 
        System.out.println("Payment completed using PhonePe"); 
    }
}

class task5{
    public static void main(String[] args) {
        PaymentGateway p1 = new GooglePay(); 
        p1.makePayment();
        PaymentGateway p2 = new PhonePe();
         p2.makePayment();
    }
}