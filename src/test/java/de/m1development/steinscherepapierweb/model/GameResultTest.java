package de.m1development.steinscherepapierweb.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameResultTest {

    @Test
    void testToString() {
        assertEquals("Unentschieden!", GameResult.DRAW.toString());
        assertEquals("Sie haben gewonnen!", GameResult.WON.toString());
        assertEquals("Sie haben verloren!", GameResult.LOST.toString());
    }
}