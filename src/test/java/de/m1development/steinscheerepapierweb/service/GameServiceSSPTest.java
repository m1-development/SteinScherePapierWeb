package de.m1development.steinscheerepapierweb.service;

import de.m1development.steinscheerepapierweb.model.GameResult;
import de.m1development.steinscheerepapierweb.model.Symbols;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameServiceSSPTest {

    GameServiceSSP gameServiceSSP = new GameServiceSSP();

    @Test
    void getGameId() {
        assertEquals(gameServiceSSP.getGameId(), "Stein Schere Papier");
    }

    @Test
    void getGameIndexFile() {
        assertEquals(gameServiceSSP.getGameIndexFile(), "indexSSP.html");
    }

    @Test
    void playInternalWithAllGameResults() {
        assertEquals(gameServiceSSP.playInternal(Symbols.STEIN, Symbols.SCHERE), GameResult.WON.toString());
        assertEquals(gameServiceSSP.playInternal(Symbols.STEIN, Symbols.PAPIER), GameResult.LOST.toString());
        assertEquals(gameServiceSSP.playInternal(Symbols.STEIN, Symbols.STEIN), GameResult.DRAW.toString());
    }
}