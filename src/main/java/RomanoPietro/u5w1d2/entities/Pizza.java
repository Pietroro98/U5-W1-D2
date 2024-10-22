package RomanoPietro.u5w1d2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Setter
@Getter
@ToString
public class Pizza extends FoodItem {
    private List<String> toppings;
    private String size;


    public Pizza(String name, double price, int calories, List<String> toppings, String size) {
        super(name, price, calories);
        this.toppings = toppings;
        this.size = size;
    }
}
