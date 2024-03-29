package com.mars;

import java.util.Scanner;


// An interface to interact and get the plateau boundaries and show Messages

public class View {
    private int topRightX;
    private int topRightY;
    Scanner scan;

    public View(int X, int Y) {
        topRightX = X;
        topRightY = Y;
    }

    public View() {

    }

    public int getTopRightXCoordinateOfPlateau() {
        return topRightX;
    }

    public int getTopRightYCoordinateOfPlateau() {
        return topRightY;
    }

    public void fixPlateau() {
        System.out.print("\nEnter the top X Coordinate of plateau : ");
        scan = new Scanner(System.in);
        topRightX = scan.nextInt();
        System.out.print("Enter the top Y Coordinate of plateau : ");
        scan = new Scanner(System.in);
        topRightY = scan.nextInt();
    }

    public void printMessage(String Message) {
        System.out.println(Message);
    }
}
