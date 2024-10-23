package RomanoPietro.u5w1d2.entities;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Toppings extends FoodItem {
    private String name;

    public Toppings(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

}

