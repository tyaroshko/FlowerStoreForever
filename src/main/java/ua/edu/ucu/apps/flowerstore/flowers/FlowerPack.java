package ua.edu.ucu.apps.flowerstore.flowers;

public class FlowerPack {
    private final Flower flower;
    private final int amount;

    public FlowerPack(final Flower flowerInPack, final int amountInPack) {
        this.flower = flowerInPack;
        this.amount = amountInPack;
    }

    public String getType() {
        return this.flower.getClass().getSimpleName();
    }

    public double getPrice() {
        return this.amount * this.flower.getPrice();
    }

    public String getColor() {
        return this.flower.getColor();
    }

    public int getAmount() {
        return this.amount;
    }
}
