package ua.edu.ucu.apps.flowerstore.flowers;

public class Chamomile extends Flower {
    public Chamomile(int price, int sepalLength) {
        super(FlowerColor.GREEN, price, sepalLength);
        this.setColor(FlowerColor.BLUE);
    }
}
