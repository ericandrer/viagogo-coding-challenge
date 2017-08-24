package pricing;

import java.text.DecimalFormat;
import java.util.Random;

public class TicketPrice {

    private Double price;

    // Default Constructor
    public TicketPrice() {}

    // Getter for the price.
    public Double getPrice() {
        return this.price;
    }

    /**
     * Method to produce a random price with no more than 2 decimals.
     */
    public void price() {
        Random rand = new Random();
        DecimalFormat randomPrice = new DecimalFormat("###.00");
        this.price = Double.parseDouble(randomPrice.format(Math.abs(rand.nextInt()) / 10000000.0));
    }

}
