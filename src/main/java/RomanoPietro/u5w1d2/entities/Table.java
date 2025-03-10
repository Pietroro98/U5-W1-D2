package RomanoPietro.u5w1d2.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class Table {
    private int numTable;
    private int numMaxCoperti;
    private boolean isFree;
    private double costoCoperto;

    public void print() {
        System.out.println("numero tavolo--> " + numTable);
        System.out.println("numero massimo coperti--> " + numMaxCoperti);
        System.out.println("occupato/libero--> " + (this.isFree ? "Libero" : "Occupato"));
    }
}
