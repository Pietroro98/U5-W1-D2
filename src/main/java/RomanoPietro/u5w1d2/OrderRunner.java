package RomanoPietro.u5w1d2;

import RomanoPietro.u5w1d2.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@Component
public class OrderRunner implements CommandLineRunner {

    private static final Logger logger = Logger.getLogger(OrderRunner.class.getName());

    private final Menu menu;
    private final double seatCost;

    @Autowired
    public OrderRunner(Menu menu, @Value("${seat.cost}") double seatCost) {
        this.menu = menu;
        this.seatCost = seatCost;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Inizializzazione dell'ordine...");

        // Verifica che le liste non siano vuote o null
        if (menu.getPizzas().isEmpty() || menu.getToppings().isEmpty() || menu.getDrinks().isEmpty()) {
            logger.severe("Il menu non è stato inizializzato correttamente!");
            return;
        }

        Table table = new Table(1, 4, "free");
        table.setStatus("occupied");

        List<FoodItem> items = Arrays.asList(
                menu.getPizzas().get(0),
                menu.getToppings().get(0),
                menu.getDrinks().get(0)
        );


        Order order = new Order(1, "ongoing", 3, LocalDateTime.now(), items, seatCost);

        logger.info(order.toString());
    }
}