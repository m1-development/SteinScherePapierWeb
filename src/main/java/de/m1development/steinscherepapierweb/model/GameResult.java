package de.m1development.steinscherepapierweb.model;

public enum GameResult
{
    DRAW, WON, LOST;

    @Override
    public String toString() {
        return switch (this) {
            case WON -> "Sie haben gewonnen!";
            case LOST -> "Sie haben verloren!";
            case DRAW -> "Unentschieden!";
        };
    }
}
