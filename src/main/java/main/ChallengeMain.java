package main;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeMain {

    public static void main(String args[]) {
        System.out.println("Hello! Welcome to Viagogo Coding Challenge.");
        System.out.println("Please enter your coordinates: ");

        Scanner in = new Scanner(System.in);
        String coordinates = in.nextLine();
        String[] vars= coordinates.split(",");

        System.out.println(Arrays.toString(vars));

    }
}
