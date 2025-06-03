package de.m1development.steinscherepapierweb.service;

import org.springframework.ui.Model;

public interface GameService {
    
    String getGameId();
    
    String getGameIndexFile();

    String play(Model model);
}
