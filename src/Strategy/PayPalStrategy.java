package Strategy;

public class PayPalStrategy implements PaymentStrategy {
    private final String emailAddress;
    private final String password;

    public PayPalStrategy(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    @Override
    public void pay(double totalPrice) {
        /*
        Doing the payment using email, and password
         */
        System.out.printf(
                "Pay $%.2f using PayPal provided with email address: %s and password: %s%n",
                totalPrice,
                emailAddress,
                password);
    }
}
