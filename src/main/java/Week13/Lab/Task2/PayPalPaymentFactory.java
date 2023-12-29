package Week13.Lab.Task2;

public class PayPalPaymentFactory implements PaymentFactory{
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}
