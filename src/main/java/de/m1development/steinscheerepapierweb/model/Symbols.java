package de.m1development.steinscheerepapierweb.model;

public enum Symbols {
    STEIN, SCHERE, PAPIER;

    @Override
    public String toString() {
        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }

    public static Symbols fromString(String symbol) {
        return Symbols.valueOf(symbol.toUpperCase());
    }

    public static Symbols getRandomSymbol() {
        return Symbols.values()[(int) (Math.random() * Symbols.values().length)];
    }

    public String versus(Symbols opponentChoice) {
        if (this == opponentChoice) {
            return GameResult.DRAW.toString();
        }

        if (this == STEIN && opponentChoice == PAPIER
            || this == SCHERE && opponentChoice == STEIN
            || this == PAPIER && opponentChoice == SCHERE)
        {
            return GameResult.LOST.toString();
        }

        return GameResult.WON.toString();
    }
}
