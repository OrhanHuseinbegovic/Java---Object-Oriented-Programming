package Week13.Lab.Task2;

public class CreditCardPaymentFactory implements PaymentFactory{
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}
