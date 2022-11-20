package ua.edu.ucu.apps.flowerstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.flowerstore.flowers.Flower;
import ua.edu.ucu.apps.flowerstore.flowers.FlowerColor;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/flowers")
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(new Flower(FlowerColor.BLUE, 3.0, 80),
                new Flower(FlowerColor.RED, 4.5, 60));
    }
}
