package de.m1development.steinscheerepapierweb.controller;

import de.m1development.steinscheerepapierweb.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {

    GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("gameId", gameService.getGameId());
        return gameService.getGameRessourceFile();
    }
}
