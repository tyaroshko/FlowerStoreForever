package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.Getter;

import java.util.List;

@Getter
public class FlowerSpec {
    private final int amount;
    private final FlowerColor color;
    private final List<String> flowersTypes;

    public FlowerSpec(final int amount, final FlowerColor color,
                      final List<String> flowersTypes) {
        this.amount = amount;
        this.color = color;
        this.flowersTypes = flowersTypes;
    }
}