package com.mars;

import java.util.Scanner;


public class Rover {
    int x, y;
    char direction;
    String directionsToExplore;
    String location;

    public void getLocation() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the X Coordinate of Rover : ");
        x = scan.nextInt();
        System.out.print("\nEnter the Y Coordinate of Rover : ");
        Scanner in = new Scanner(System.in);
        y = in.nextInt();
        System.out.print("\n Enter the Direction of Rover : ");
        direction = scan.next().charAt(0);
    }

    public void getDirectionsToExplore() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the Directions for the Rover to explore : ");
        directionsToExplore = scan.nextLine();
    }

    public void navigate() {
        Move move = new Move();
        for (int i = 0; i < directionsToExplore.length(); i++) {
            switch (directionsToExplore.charAt(i)) {
                case 'L':
                    direction = move.leftRotation(direction);
                    break;
                case 'R':
                    direction = move.rightRotation(direction);
                    break;
                case 'M':
                    location = move.oneStepAhead(x, y, direction);
                    break;
                default:
                    System.out.println("\nInvalid directions");
                    break;
            }
        }
    }

    public String showFinalLocation() {
        return x + " " + y + " " + direction;
    }
}

