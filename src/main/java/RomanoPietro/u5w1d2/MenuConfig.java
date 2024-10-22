package RomanoPietro.u5w1d2;


import RomanoPietro.u5w1d2.entities.Drinks;
import RomanoPietro.u5w1d2.entities.Menu;
import RomanoPietro.u5w1d2.entities.Pizza;
import RomanoPietro.u5w1d2.entities.Toppings;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;


@Configuration
public class MenuConfig {

    @Value("${seat.cost}")
    private double seatCost;

    //------------------Pizzas----------------------------

    @Bean
    @Qualifier("margheritaPizza")
    public Pizza Margherita(){
        return new Pizza("Margherita", 4.99, 1104, Arrays.asList("Tomato", "Cheese"), "xxl");
    }

    @Bean
    @Qualifier("hawaiianPizza")
    public Pizza hawaiian(){
        return new Pizza("Hawaiian", 6.49, 1024, Arrays.asList("Tomato", "Cheese","Ham", "Pineapple"), "normal");
    }
    @Bean
    @Qualifier("diavolaPizza")
    public Pizza diavola(){
        return new Pizza("Diavola", 5.99, 1160, Arrays.asList("Tomato", "Cheese", "Salame"), "normal");
    }



    //------------------Toppings----------------------------
    @Bean
    @Qualifier("cheeseToppings")
    public Toppings cheese(){
        return new Toppings("Cheese", 0.69, 92);
    }
    @Bean
    @Qualifier("hamToppings")
    public Toppings ham(){
        return new Toppings("Ham", 0.99, 35);
    }
    @Bean
    @Qualifier("onionsToppings")
    public Toppings onions(){
        return new Toppings("Onions", 0.69, 22);
    }
    @Bean
    @Qualifier("pineappleToppings")
    public Toppings pineapple(){
        return new Toppings("Pineapple", 0.79, 24);
    }
    @Bean
    @Qualifier("salameToppings")
    public Toppings Salame(){
        return new Toppings("Salame", 0.99, 86);
    }


    //------------------DRINKS----------------------------
    @Bean
    @Qualifier("cocaColaDrink")
    public Drinks cocaCola(){
        return new Drinks("cocaCola",2.50, 150, 0.33, 0);
    }

    @Bean
    @Qualifier("waterDrink")
    public Drinks water(){
        return new Drinks("Water",1.00, 0, 0.33, 0);
    }

    @Bean
    @Qualifier("lemonadeDrink")
    public Drinks lemonade(){
        return new Drinks("Lemonade",1.00, 128, 0.33, 0);
    }

    @Bean
    @Qualifier("beerDrink")
    public Drinks beer(){
        return new Drinks("Beer",5.00, 43, 0.66, 4.5);
    }

    @Bean
    @Qualifier("beer2Drink")
    public Drinks getBeer2(){
        return new Drinks("Beer2",5.00, 43, 0.66, 4.5);
    }

    @Bean
    @Primary
    public Menu menu(){
        return new Menu(

                Arrays.asList(Margherita(), hawaiian(), diavola()),
                Arrays.asList(cheese(), ham(), onions(), pineapple(), Salame()),
                Arrays.asList(cocaCola(), water(), lemonade(), beer())
        );
    }


}
