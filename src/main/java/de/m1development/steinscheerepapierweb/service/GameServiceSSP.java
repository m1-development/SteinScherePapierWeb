package de.m1development.steinscheerepapierweb.service;

import de.m1development.steinscheerepapierweb.model.Symbols;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

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
    public String play(Model model) {
        String humanChoice = String.valueOf(model.getAttribute("humanChoice"));
        Symbols computerChoice = Symbols.getRandomSymbol();

        String gameResult = playInternal(Symbols.fromString(humanChoice), computerChoice);

        model.addAttribute("computerChoice", computerChoice);
        model.addAttribute("gameResult", gameResult);

        return RESULT_HTML;
    }

    public String playInternal(Symbols humanChoice, Symbols computerChoice) {
        return humanChoice.versus(computerChoice);
    }
}
