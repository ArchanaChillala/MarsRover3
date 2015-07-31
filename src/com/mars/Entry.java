package com.mars;


public class Entry {
    public static void main(String[] args) {
        View view = new View();
        Rover rover1 = new Rover();
        Rover rover2 = new Rover();

        view.fixPlateau();

        view.printMessage("\nRover 1 :");
        rover1.getLocation();
        rover1.getDirectionsToExplore();
        rover1.navigate();
        view.printMessage(" Final Location of Rover : ");
        rover1.showFinalLocation();

        view.printMessage("\nRover 2 :");
        rover2.getLocation();
        rover2.getDirectionsToExplore();
        rover2.navigate();
        view.printMessage(" Final Location of Rover : ");
        rover2.showFinalLocation();
    }
}
