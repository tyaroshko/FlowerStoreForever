package ua.edu.ucu.apps.flowerstore.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.flowers.Item;
import ua.edu.ucu.apps.flowerstore.payments.Payment;

import java.util.List;

@Getter
@AllArgsConstructor
public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculatePrice() {
        double price = 0;
        for (Item item : this.items) {
            price += item.getPrice();
        }
        return price;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void processOrder() {
        this.delivery.deliver(this.items);
        this.payment.pay(this.calculatePrice());
        System.out.println("Your order has " + this.items.size() + " items and price is " +
                this.calculatePrice() + "and will be delivered using " + this.delivery.name);
    }
}
