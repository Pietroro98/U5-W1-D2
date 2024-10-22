package RomanoPietro.u5w1d2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
public class Order {
    private int orderNumber;
    private String status;

    private int numberOfSeats;
    private LocalDateTime acquisitionTime;
    private List<FoodItem> items;
    private double totalAmount;


    public Order(int orderNumber, String status, int numberOfSeats,
                 LocalDateTime acquisitionTime, List<FoodItem> items, double seatCost) {
        this.orderNumber = orderNumber;
        this.status = status;
        this.numberOfSeats = numberOfSeats;
        this.acquisitionTime = acquisitionTime;
        this.items = items;
        this.totalAmount = calculateTotalAmount(seatCost);
    }

    private double calculateTotalAmount(double seatCost) {
        double sum = items.stream().filter(java.util.Objects::nonNull).mapToDouble(FoodItem::getPrice).sum();
        return sum + (seatCost * numberOfSeats);
    }
}

