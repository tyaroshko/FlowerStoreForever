package ua.edu.ucu.apps.flowerstore.flowers;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPackList = new ArrayList<FlowerPack>();

    public void add(final FlowerPack flowerPack) {
        this.flowerPackList.add(flowerPack);
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPackList) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}
