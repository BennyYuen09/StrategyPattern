package Strategy;

public class PayPalStrategy implements PaymentStrategy {
    private String emailAddress;
    private String password;

    public PayPalStrategy(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    @Override
    public void pay(double totalPrice) {
        /*
        Doing the payment using email, and password
         */
        System.out.println("Pay $" + totalPrice + " using PayPal.");
    }
}
