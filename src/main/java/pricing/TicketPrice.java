package pricing;

import java.text.DecimalFormat;
import java.util.Random;

public class TicketPrice {

    void price() {
        Random rand = new Random();
        for (int j = 0; j < 10; j++) {
            DecimalFormat df = new DecimalFormat("###.00"); // Set your desired format here.
            System.out.println("$" + df.format(Math.abs(rand.nextInt()) / 10000000.0));
        }
    }

}
