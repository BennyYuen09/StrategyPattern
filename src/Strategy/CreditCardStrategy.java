package Strategy;

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
        System.out.printf(
                "Pay $%.2f using credit card provided with cardNumber: %s, name: %s and cvv: %s%n",
                totalPrice,
                cardNumber,
                name,
                cvv);
    }
}
