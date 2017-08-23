package main;

import pricing.TicketPrice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ChallengeMain {

/*    public static ArrayList<TicketPrice> myArray() {
        ArrayList<TicketPrice> al = new ArrayList();
        al.add(new TicketPrice());
        return al;
    }*/

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
                }
            } catch(NumberFormatException e) {
                System.out.println("The coordinates are not a valid number or in the correct format.");
                System.out.println("E.g: 4,2");
                //e.printStackTrace();
                myFlag = false;
            }

                //System.out.println(Arrays.toString(vars) + Arrays.toString(new ArrayList[]{myArray()}));
        }
    }
}
