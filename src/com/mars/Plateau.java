package com.mars;

public class Plateau {
    private int topRightX;
    private int topRightY;

    public Plateau(int X, int Y)
    {
        topRightX = X;
        topRightY = Y;
    }

    public int getTopRightXCoordinateOfPlateau() {
        return topRightX;
    }

    public int getTopRightYCoordinateOfPlateau() {
        return topRightY;
    }

}
