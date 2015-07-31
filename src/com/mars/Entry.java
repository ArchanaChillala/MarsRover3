package com.mars;


// Entry Point to Mars Rover Application

public class Entry {
    public static void main(String[] args) {
        View view = new View();
        view.fixPlateau();

        Rover rover1 = new Rover();
        Rover rover2 = new Rover();

        view.printMessage("\nRover 1 :");
        rover1.getLocation();
        rover1.getDirectionsToExplore();
        rover1.navigate();
        view.printMessage("\nFinal Location of Rover : ");
        view.printMessage(rover1.showFinalLocation());

        view.printMessage("\nRover 2 :");
        rover2.getLocation();
        rover2.getDirectionsToExplore();
        rover2.navigate();
        view.printMessage("\nFinal Location of Rover : ");
        view.printMessage(rover2.showFinalLocation());
    }
}
