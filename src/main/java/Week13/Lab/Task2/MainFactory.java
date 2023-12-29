package Week13.Lab.Task2;

public class MainFactory {
    public static void main(String[] args) {
        // Instantiate payment factories
        PaymentFactory creditCardPaymentFactory = new CreditCardPaymentFactory();
        PaymentFactory payPalPaymentFactory = new PayPalPaymentFactory();

        // Use factories to create payment objects
        Payment creditCardPayment = creditCardPaymentFactory.createPayment();
        Payment payPalPayment = payPalPaymentFactory.createPayment();

        // Call processPayment method on each payment object
        creditCardPayment.processPayment();
        payPalPayment.processPayment();
    }
}
