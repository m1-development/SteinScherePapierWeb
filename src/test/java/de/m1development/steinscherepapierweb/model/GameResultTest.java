package de.m1development.steinscherepapierweb.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameResultTest {

    @Test
    void testToString() {
        assertEquals(GameResult.DRAW.toString(), "Unentschieden!");
        assertEquals(GameResult.WON.toString(), "Sie haben gewonnen!");
        assertEquals(GameResult.LOST.toString(), "Sie haben verloren!");
    }
}