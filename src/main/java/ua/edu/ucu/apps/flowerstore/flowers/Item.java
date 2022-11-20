package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private String description;

    public double getPrice() {
        return 0;
    }
}
