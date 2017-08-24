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
                String[] vars= coordinates.split(",");
                int x = Integer.parseInt(vars[0]);
                int y = Integer.parseInt(vars[1]);
                if (x > 10 || y > 10 || x < -10 || y < -10) {
                    myFlag = false;
                    System.out.println("The coordinate ranges are from -10 to +10 (X axis), and -10 to +10 (Y axis).");
                    System.out.println("E.g: 4,2");
                } else {
                    myFlag = true;
                    System.out.println("Coordinates accepted: " + Arrays.toString(vars));

                    //TODO Complete loop for 10 times.

                    EventId newEvent = new EventId();
                    System.out.print("Event " + newEvent.uniqueId());

                    TicketPrice tp = new TicketPrice();
                    tp.price();
                    System.out.print(" $" + tp.getPrice());

                    Point userPoint = new Point(x,y);
                    Point eventPoint = new Point();
                    eventPoint.randomX();
                    eventPoint.randomY();
                    System.out.println(" Event Location: X Axis " + eventPoint.getX() + " Y Axis " + eventPoint.getY());
                    System.out.println("Your Distance to the event: " + userPoint.distanceTo(eventPoint));

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
