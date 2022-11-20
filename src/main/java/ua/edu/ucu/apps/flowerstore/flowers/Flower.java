package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Flower {
    private FlowerColor color;
    private double sepalLength;
    private double price;

    public String getColor() {
        return color.getColor();
    }
}
