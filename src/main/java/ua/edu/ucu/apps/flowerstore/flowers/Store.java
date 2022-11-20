package ua.edu.ucu.apps.flowerstore.flowers;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<FlowerBucket> flowerBuckets = new ArrayList<FlowerBucket>();

    public Store() {
    }

    public void add(final FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }

//        public ArrayList<FlowerBucket> search(double minPrice, double maxPrice) {
//            ArrayList<FlowerBucket> result = new ArrayList<>();
//            for (FlowerBucket flowerBucket : flowerBuckets) {
//                if (flowerBucket.getPrice() >= minPrice) {
//                    if (flowerBucket.getPrice() <= maxPrice) {
//                        result.add(flowerBucket);
//                    }
//                }
//            }
//            return result;
//        }
}

