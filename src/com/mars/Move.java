package com.mars;

public class Move {
    private Plateau plateau;


    public char leftRotation(char direction) {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'W':
                direction = 'S';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'E':
                direction = 'N';
                break;
            default:
                System.out.print("direction does not exist");
                break;

        }
        return direction;
    }

    public char rightRotation(char direction) {
        switch (direction) {
            case 'W':
                direction = 'N';
                break;
            case 'N':
                direction = 'E';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'S':
                direction = 'W';
                break;
        }
        return direction;
    }


    public String oneStepAhead(int XCoordinate, int YCoordinate, char direction) {
        switch (direction) {
            case 'E':
                XCoordinate++;
                break;
            case 'S':
                YCoordinate--;
                break;
            case 'W':
                XCoordinate--;
                break;
            case 'N':
                YCoordinate++;
                break;
        }
        return XCoordinate + " " + YCoordinate + " " + direction;
    }
}
