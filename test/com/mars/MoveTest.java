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

    @Test
    public void shouldMoveAStepRightWhenFacingEast() {
        assertEquals("2 3 E", move.oneStepAhead(1, 3, 'E'));
    }

    @Test
    public void shouldMoveAStepDownWhenFacingSouth() {
        assertEquals("1 2 S", move.oneStepAhead(1, 3, 'S'));
    }

    @Test
    public void shouldMoveAStepLeftWhenFacingWest() {
        assertEquals("1 3 W", move.oneStepAhead(2, 3, 'W'));
    }

    @Test
    public void shouldMoveAStepUpWhenFacingNorth() {
        assertEquals("2 4 N", move.oneStepAhead(2, 3, 'N'));
    }
}
