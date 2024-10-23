package RomanoPietro.u5w1d2.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Drinks extends FoodItem{
    private String name;

    public Drinks(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }
}
