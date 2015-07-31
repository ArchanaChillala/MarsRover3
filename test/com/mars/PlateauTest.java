package com.mars;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlateauTest {

    @Test
    public void shouldGiveTopRightXCoordinateOfPlateau()
    {
        Plateau plateau = new Plateau(2, 3);

        assertEquals(2, plateau.getTopRightXCoordinateOfPlateau());
    }

    @Test
    public void shouldGiveTopRightYCoordinateOfPlateau()
    {
        Plateau plateau = new Plateau(2, 3);

        assertEquals(3, plateau.getTopRightYCoordinateOfPlateau());
    }
}
