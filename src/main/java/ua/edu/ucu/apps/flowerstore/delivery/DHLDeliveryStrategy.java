package ua.edu.ucu.apps.flowerstore.delivery;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.flowerstore.flowers.Item;

import java.util.List;

@Getter
@Setter
public class DHLDeliveryStrategy implements Delivery {
    private String name = "DHL delivery";

    @Override
    public void deliver(List<Item> items) {
        double price = 0;
        double deliveryPrice = 20;
        for (Item item : items) {
            price += item.getPrice();
        }
        price += deliveryPrice;

        System.out.println("Order with the price " + price + " was delivered using " + name + ".");
    }
}
