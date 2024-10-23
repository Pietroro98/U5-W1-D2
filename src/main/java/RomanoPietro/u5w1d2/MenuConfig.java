package RomanoPietro.u5w1d2;


import RomanoPietro.u5w1d2.entities.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Configuration
@PropertySource("application.properties")
public class MenuConfig {

    @Value("${seat.price}")
    private double seatPrice;



    //------------------Pizzas----------------------------

    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargheritaBean() {
        List<Toppings> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        return new Pizza("Pizza Margherita", tList, false);
    }

    @Bean(name = "hawaiian_pizza")
    public Pizza pizzaHawaiianBean() {
        List<Toppings> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingHamBean());
        tList.add(toppingPineappleBean());
        return new Pizza("Hawaiian Pizza", tList, false);
    }

    @Bean(name = "salami_pizza")
    public Pizza pizzaSalamiBean() {
        List<Toppings> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingSalameBean());
        return new Pizza("Salami Pizza", tList, false);
    }

    @Bean(name = "salami_pizza_xl")
    public Pizza pizzaSalamiXlBean() {
        List<Toppings> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingSalameBean());
        return new Pizza("Salami Pizza XL", tList, true);
    }


    //------------------Toppings----------------------------

    @Bean(name = "toppings_tomato")
    public Toppings toppingTomatoBean() {
        return new Toppings("Tomato", 0, 0);
    }

    @Bean(name = "toppings_cheese")
    public Toppings toppingCheeseBean(){
        return new Toppings("Cheese", 92, 0.69);
    }
    @Bean(name = "toppings_ham")
    public Toppings toppingHamBean(){
        return new Toppings("Ham",35, 0.99);
    }
    @Bean(name = "toppings_onions")
    public Toppings toppingOnionsBean(){
        return new Toppings("Onions", 22, 0.69);
    }
    @Bean(name = "toppings_pineapple")
    public Toppings toppingPineappleBean(){
        return new Toppings("Pineapple", 24, 0.79);
    }
    @Bean(name = "toppings_salame")
    public Toppings toppingSalameBean(){
        return new Toppings("Salame", 86, 0.99);
    }


    //------------------DRINKS----------------------------
    @Bean(name = "cocaCola")
    public Drinks cocaCola(){
        return new Drinks("cocaCola", 150, 2.50);
    }

    @Bean(name = "water")
    public Drinks waterBean(){
        return new Drinks("Water", 0, 1.00);
    }

    @Bean(name = "lemonade")
    public Drinks lemonadeBean(){
        return new Drinks("Lemonade", 128 ,1.00);
    }

    @Bean(name = "beer")
    public Drinks beerBean(){
        return new Drinks("Beer", 43, 5.00);
    }

    @Bean(name = "wine")
    public Drinks wineBean() {
        return new Drinks("Wine", 607, 7.49);
    }

   @Bean("pizzas")
    List<Pizza> pizzaList() {
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(pizzaMargheritaBean());
        pizzas.add(pizzaHawaiianBean());
        pizzas.add(pizzaSalamiBean());
        pizzas.add(pizzaSalamiXlBean());
        return pizzas;
    }

    @Bean("drinks")
    List<Drinks> drinksList() {
        List<Drinks> drinks = new ArrayList<>();
        drinks.add(lemonadeBean());
        drinks.add(waterBean());
        drinks.add(wineBean());
        drinks.add(cocaCola());
        drinks.add(beerBean());
        return drinks;
    }

    @Bean("toppings")
    List<Toppings> toppingsList() {
        List<Toppings> toppings = new ArrayList<>();
        toppings.add(toppingTomatoBean());
        toppings.add(toppingCheeseBean());
        toppings.add(toppingSalameBean());
        toppings.add(toppingHamBean());
        toppings.add(toppingPineappleBean());
        toppings.add(toppingOnionsBean());
        return toppings;
    }

    @Bean("Tavolo1")
   public  Table getTable1(@Value("${seat.price}") double seatPrice) {
        return new Table(1, 5, true, seatPrice);
    }

    @Bean("Tavolo2")
    public Table getTable2(@Value("${seat.price}") double seatPrice) {
        return new Table(2, 4, true, seatPrice);
    }

    @Bean("Tavolo3")
    public Table getTable3(@Value("${seat.price}") double seatPrice) {
        return new Table(3, 8, true, seatPrice);
    }


}
