package com.mars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoveTest {
    private Move move;

    @Before
    public void setup() {
        move = new Move();
    }

    @Test
    public void LeftRotationIsWestWhenFacingNorth() {
        assertEquals('W', move.leftRotation('N'));
    }

    @Test
    public void LeftRotationIsSouthWhenFacingWest() {
        assertEquals('S', move.leftRotation('W'));
    }

    @Test
    public void LeftRotationIsEastWhenFacingSouth() {
        assertEquals('E', move.leftRotation('S'));
    }

    @Test
    public void LeftRotationIsNorthWhenFacingEast() {
        assertEquals('N', move.leftRotation('E'));
    }

    @Test
    public void RightRotationIsNorthWhenFacingWest() {
        assertEquals('N', move.rightRotation('W'));
    }

    @Test
    public void RightRotationIsEastWhenFacingNorth() {
        assertEquals('E', move.rightRotation('N'));
    }

    @Test
    public void RightRotationIsSouthWhenFacingEast() {
        assertEquals('S', move.rightRotation('E'));
    }

    @Test
    public void RightRotationIsWestWhenFacingSouth() {
        assertEquals('W', move.rightRotation('S'));
    }


}
