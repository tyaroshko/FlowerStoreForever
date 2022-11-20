package ua.edu.ucu.apps.flowerstore.flowers;

public enum FlowerColor {
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");
    private final String color;

    FlowerColor(final String stringRepresentation) {
        this.color = stringRepresentation;
    }

    public String getColor() {
        return this.color;
    }
}
