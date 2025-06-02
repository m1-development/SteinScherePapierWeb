package de.m1development.steinscheerepapierweb.service;

import org.springframework.stereotype.Service;

@Service
public class GameServiceSSP implements GameService {
    private static final String GAME_ID = "Stein Schere Papier";
    public static final String HTML_FILE = "indexSSP.html";

    @Override
    public String getGameId() {
        return GAME_ID;
    }

    @Override
    public String getGameRessourceFile() {
        return HTML_FILE;
    }
}
