package RomanoPietro.u5w1d2.entities;
import lombok.Getter;


@Getter
public abstract class FoodItem {

    protected int calories;
    protected double price;

    public FoodItem(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

}
