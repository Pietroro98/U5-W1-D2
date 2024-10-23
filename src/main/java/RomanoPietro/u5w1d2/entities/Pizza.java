package RomanoPietro.u5w1d2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Pizza extends FoodItem {
    private String name;

    private List<Toppings> toppingList;
    private boolean isXl = false;

   public Pizza(String name, List<Toppings> toppingList, boolean isXl) {
       super(700, 6.50);
        this.name = name;
        this.toppingList = toppingList;
        this.isXl = isXl;
   }

    @Override
    public int getCalories() {
        return super.getCalories() + this.getToppingList().stream().mapToInt(Toppings::getCalories).sum();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.getToppingList().stream().mapToDouble(Toppings::getPrice).sum();
    }
}
