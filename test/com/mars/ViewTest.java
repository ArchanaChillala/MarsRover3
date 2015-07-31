package com.mars;

import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ViewTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;

    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(original);
    }

    @Test
    public void shouldGiveTopRightXCoordinateOfPlateau() {
        View view = new View(2, 3);

        assertEquals(2, view.getTopRightXCoordinateOfPlateau());
    }

    @Test
    public void shouldGiveTopRightYCoordinateOfPlateau() {
        View view = new View(2, 3);

        assertEquals(3, view.getTopRightYCoordinateOfPlateau());
    }

    @Test
    public void shouldDisplayAStringMessage() {
        View view = new View();
        view.printMessage("Welcome to Mars");
        assertEquals("Welcome to Mars", outContent.toString());
    }
}
