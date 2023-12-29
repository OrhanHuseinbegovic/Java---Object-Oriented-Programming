package Week13.Lab.Task2;

public class PayPalPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal Payment");
    }
}
