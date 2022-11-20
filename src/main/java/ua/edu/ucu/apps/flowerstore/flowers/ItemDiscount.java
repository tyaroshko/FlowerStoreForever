package ua.edu.ucu.apps.flowerstore.flowers;

public class ItemDiscount extends Item{
    public ItemDiscount(Item item){
        this.item = item;
    }

    @Override
    public double getPrice(){
        return item.getPrice() * 0.2;
    }
}