public class Main {
    public static void main(String[] args) {
        //a shopping cart
        ShoppingCart shoppingCart = new ShoppingCart();

        //our item
        shoppingCart.addItem(new Item("CoCa_Cola", 5.0d));
        shoppingCart.addItem(new Item("CoCa_Cola", 5.0d));
        shoppingCart.addItem(new Item("PotatoChips", 12.0d));

        //our payment method
        CreditCardStrategy creditCard = new CreditCardStrategy("1234-5678-9012-3456", "xxx", "120");
        PayPalStrategy payPal = new PayPalStrategy("xxx@email.com", "P@ssw0rd");

        //using credit card to pay
        shoppingCart.pay(creditCard);

        //using PayPal to pay
        shoppingCart.pay(payPal);
    }
}
