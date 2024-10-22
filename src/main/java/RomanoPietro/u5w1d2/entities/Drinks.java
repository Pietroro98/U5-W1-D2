package RomanoPietro.u5w1d2.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Drinks extends FoodItem{
    private double volume;
    private double alcoholPercentage;


    public Drinks(String name, double price, int calories, double volume, double alcoholPercentage) {
        super(name, price, calories);
        this.volume = volume;
        this.alcoholPercentage = alcoholPercentage;
    }
}
