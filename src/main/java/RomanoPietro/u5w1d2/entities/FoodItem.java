package RomanoPietro.u5w1d2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public abstract class FoodItem {


    protected String name;
    protected double price;
    protected int calories;

}
