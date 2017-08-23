package pricing;

import java.text.DecimalFormat;
import java.util.Random;

public class TicketPrice {

    void price() {
        Random rand = new Random();
        DecimalFormat df = new DecimalFormat("###.00");
        System.out.println("$" + df.format(Math.abs(rand.nextInt()) / 10000000.0));

    }

}
