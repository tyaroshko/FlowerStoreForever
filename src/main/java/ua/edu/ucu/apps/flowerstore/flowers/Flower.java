package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Flower extends Item{
    @Id
    @GeneratedValue
    private int id;
    private FlowerColor color;
    private double sepalLength;
    private double price;

    public String getColor() {
        return color.getColor();
    }
}
