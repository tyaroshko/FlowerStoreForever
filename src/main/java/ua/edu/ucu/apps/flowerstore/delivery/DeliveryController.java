package ua.edu.ucu.apps.flowerstore.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.flowerstore.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.delivery.PostDeliveryStrategy;

import java.util.List;

@RequestMapping(path = "/api/v1/delivery")
@RestController
public class DeliveryController {
    @GetMapping
    public List<? extends Delivery> getDeliveryStrategies() {
        Delivery dhlDelivery = new DHLDeliveryStrategy();
        Delivery postDelivery = new PostDeliveryStrategy();
        return List.of(dhlDelivery, postDelivery);
    }
}
