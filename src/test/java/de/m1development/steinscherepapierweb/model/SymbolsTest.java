package de.m1development.steinscherepapierweb.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymbolsTest {

    @Test
    void testToString() {
        assertEquals(Symbols.STEIN.toString(), "Stein");
        assertEquals(Symbols.SCHERE.toString(), "Schere");
        assertEquals(Symbols.PAPIER.toString(), "Papier");
    }

    @Test
    void fromString() {
        assertEquals(Symbols.fromString("Stein"), Symbols.STEIN);
        assertEquals(Symbols.fromString("Schere"), Symbols.SCHERE);
        assertEquals(Symbols.fromString("Papier"), Symbols.PAPIER);
    }

    @Test
    void versusStoneAgainstAllSymbols() {
        assertEquals(Symbols.STEIN.versus(Symbols.STEIN), GameResult.DRAW.toString());
        assertEquals(Symbols.STEIN.versus(Symbols.SCHERE), GameResult.WON.toString());
        assertEquals(Symbols.STEIN.versus(Symbols.PAPIER), GameResult.LOST.toString());
    }

    @Test
    void versusScissorAgainstAllSymbols() {
        assertEquals(Symbols.SCHERE.versus(Symbols.SCHERE), GameResult.DRAW.toString());
        assertEquals(Symbols.SCHERE.versus(Symbols.PAPIER), GameResult.WON.toString());
        assertEquals(Symbols.SCHERE.versus(Symbols.STEIN), GameResult.LOST.toString());
    }

    @Test
    void versusPaperAgainstAllSymbols() {
        assertEquals(Symbols.PAPIER.versus(Symbols.PAPIER), GameResult.DRAW.toString());
        assertEquals(Symbols.PAPIER.versus(Symbols.STEIN), GameResult.WON.toString());
        assertEquals(Symbols.PAPIER.versus(Symbols.SCHERE), GameResult.LOST.toString());
    }
}