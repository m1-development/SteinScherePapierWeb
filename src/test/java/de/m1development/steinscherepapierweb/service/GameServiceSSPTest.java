package de.m1development.steinscherepapierweb.service;

import de.m1development.steinscherepapierweb.model.GameResult;
import de.m1development.steinscherepapierweb.model.Symbols;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameServiceSSPTest {

    private final GameServiceSSP gameServiceSSP = new GameServiceSSP();

    @Test
    void getGameId() {
        assertEquals("Stein Schere Papier", gameServiceSSP.getGameId());
    }

    @Test
    void getGameIndexFile() {
        assertEquals("indexSSP.html", gameServiceSSP.getGameIndexFile());
    }

    @Test
    void playInternalWithAllGameResults() {
        assertEquals(GameResult.WON.toString(), gameServiceSSP.playInternal(Symbols.STEIN, Symbols.SCHERE));
        assertEquals(GameResult.LOST.toString(), gameServiceSSP.playInternal(Symbols.STEIN, Symbols.PAPIER));
        assertEquals(GameResult.DRAW.toString(), gameServiceSSP.playInternal(Symbols.STEIN, Symbols.STEIN));
    }
}