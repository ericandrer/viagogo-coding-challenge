package main;

import event.EventId;
import location.Point;
import pricing.TicketPrice;
import java.util.Arrays;
import java.util.Scanner;

public class ChallengeMain {

    public static void main(String args[]) {
        System.out.println("Hello! Welcome to Viagogo Coding Challenge.");
        boolean myFlag = false;
        while (!myFlag) {
            try {
                System.out.println("Please enter your coordinates: ");
                Scanner in = new Scanner(System.in);
                String coordinates = in.nextLine();

                // Split the user input into an array for easy manipulation.
                String[] vars= coordinates.split(",");
                int x = Integer.parseInt(vars[0]);
                int y = Integer.parseInt(vars[1]);

                // Statement to check all the user inputs are valid.
                if (x > 10 || y > 10 || x < -10 || y < -10) {
                    myFlag = false;
                    System.out.println("The coordinate ranges are from -10 to +10 (X axis), and -10 to +10 (Y axis).");
                    System.out.println("E.g: 4,2");
                } else {
                    myFlag = true;
                    System.out.println("Coordinates accepted: " + Arrays.toString(vars));

                    // Bi-dimensional array declaration.
                    double[][] data = new double[10][4];

                    for (int i = 0 ; i < 10; i++) {

                        data[i][0] = i;

                        // Declaration and assignments.

                        EventId newEvent = new EventId();
                        int event = newEvent.uniqueId();
                        data[i][1] = event;

                        TicketPrice tp = new TicketPrice();
                        tp.price();
                        double price = tp.getPrice();
                        data[i][2] = price;

                        Point userPoint = new Point(x, y);
                        Point eventPoint = new Point();
                        eventPoint.randomX();
                        eventPoint.randomY();
                        System.out.println("Event # " + data[i][0] + "\t Event Location: X Axis "
                                + eventPoint.getX() + " Y Axis " + eventPoint.getY());
                        double distance = userPoint.distanceTo(eventPoint);
                        data[i][3] = distance;
                    }

                    // Lambda implementation for sorting the distance column using Comparator interface.
                    Arrays.sort(data, (o1, o2) -> (int) (o1[3] - o2[3]));

                    System.out.println("");
                    System.out.println("The closest Five events to your coordinates [" + x + ", " + y + "] are: ");
                    System.out.println("");

                    // Printing statement for each of the results.
                    for (int i = 0 ; i < 5 ; i++) {
                        System.out.println("Event #" + data[i][0] + "\tTickets: " + data[i][1] +
                                "\tPrice $" + data[i][2] + "\tDistance " + data[i][3]);
                    }

                }
            } catch(NumberFormatException | ArrayIndexOutOfBoundsException e ) {
                System.out.println("The coordinates are invalid please check the correct format.");
                System.out.println("E.g: 4,2");
                //e.printStackTrace();
                myFlag = false;
            }
        }
    }
}
