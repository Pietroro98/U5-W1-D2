package RomanoPietro.u5w1d2.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Toppings extends FoodItem {
    public Toppings(String name, double price, int calories) {
        super(name, price, calories);
    }
}

