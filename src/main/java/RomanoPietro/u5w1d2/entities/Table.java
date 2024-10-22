package RomanoPietro.u5w1d2.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Table {
    private int tableNumber;
    private int maxSeats;
    private String status;

    public Table(int tableNumber, int maxSeats, String status) {
        this.tableNumber = tableNumber;
        this.maxSeats = maxSeats;
        this.status = status;
    }
}
