package de.m1development.steinscheerepapierweb.service;

import org.springframework.stereotype.Service;

@Service
public class GameServiceSSP implements GameService {
    private static final String GAME_ID = "Stein Schere Papier";
    public static final String INDEX_HTML = "indexSSP.html";
    public static final String RESULT_HTML = "resultSSP.html";

    @Override
    public String getGameId() {
        return GAME_ID;
    }

    @Override
    public String getGameIndexFile() {
        return INDEX_HTML;
    }

    @Override
    public String getGameResultFile() {
        return RESULT_HTML;
    }
}
