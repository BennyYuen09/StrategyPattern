public class CreditCardStrategy implements PaymentStrategy {
    private final String cardNumber;
    private final String name;
    private final String cvv;     //Card Verification Value

    public CreditCardStrategy(String cardNumber, String name, String cvv) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.cvv = cvv;
    }

    @Override
    public void pay(double totalPrice) {
        /*
        Doing the payment using card number, name and cvv
         */
        System.out.println("Pay $" + totalPrice + "using credit card.");
    }
}
