import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itemList;

    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item){
        itemList.add(item);
    }

    public void removeItem(Item item){
        itemList.remove(item);
    }

    public double getTotalPrice(){
        return itemList
                .stream()
                .mapToDouble(Item::getPrice)
                .sum();
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(getTotalPrice());
    }
}
