package de.m1development.steinscherepapierweb.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymbolsTest {

    @Test
    void testToString() {
        assertEquals("Stein", Symbols.STEIN.toString());
        assertEquals("Schere", Symbols.SCHERE.toString());
        assertEquals("Papier", Symbols.PAPIER.toString());
    }

    @Test
    void fromString() {
        assertEquals(Symbols.STEIN, Symbols.fromString("Stein"));
        assertEquals(Symbols.SCHERE, Symbols.fromString("Schere"));
        assertEquals(Symbols.PAPIER, Symbols.fromString("Papier"));
    }

    @Test
    void versusStoneAgainstAllSymbols() {
        assertEquals(GameResult.DRAW.toString(), Symbols.STEIN.versus(Symbols.STEIN));
        assertEquals(GameResult.WON.toString(), Symbols.STEIN.versus(Symbols.SCHERE));
        assertEquals(GameResult.LOST.toString(), Symbols.STEIN.versus(Symbols.PAPIER));
    }

    @Test
    void versusScissorAgainstAllSymbols() {
        assertEquals(GameResult.DRAW.toString(), Symbols.SCHERE.versus(Symbols.SCHERE));
        assertEquals(GameResult.WON.toString(), Symbols.SCHERE.versus(Symbols.PAPIER));
        assertEquals(GameResult.LOST.toString(), Symbols.SCHERE.versus(Symbols.STEIN));
    }

    @Test
    void versusPaperAgainstAllSymbols() {
        assertEquals(GameResult.DRAW.toString(), Symbols.PAPIER.versus(Symbols.PAPIER));
        assertEquals(GameResult.WON.toString(), Symbols.PAPIER.versus(Symbols.STEIN));
        assertEquals(GameResult.LOST.toString(), Symbols.PAPIER.versus(Symbols.SCHERE));
    }
}