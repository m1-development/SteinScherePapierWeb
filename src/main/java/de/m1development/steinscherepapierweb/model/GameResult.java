package de.m1development.steinscherepapierweb.model;

public enum GameResult
{
    DRAW, WON, LOST;

    @Override
    public String toString() {
        switch (this) {
            case WON:
                return "Sie haben gewonnen!";
            case LOST:
                return "Sie haben verloren!";
            case DRAW:
            default:
                return "Unentschieden!";
        }
    }
}
