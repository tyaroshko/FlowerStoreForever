package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    protected double price;
    protected Item item;
    private String description;

    public double getPrice() {
        return this.price;
    }
}
