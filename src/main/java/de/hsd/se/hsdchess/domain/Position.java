package de.hsd.se.hsdchess.domain;

public class Position {
    /**
     * Spaltenposition a-h
     */
    private char spalte;

    /**
     * Zeilenposition 1-8
     */
    private int reihe;
    
    
    /**
     * Erzeugt eine neue Position, wenn sie auf dem Schachfeld gültig ist.
     * @param _spalte a-h
     * @param _reihe 1-8
     */
    public Position(char _spalte, int _reihe) {
        spalte = _spalte;
        reihe = _reihe;
    }
}
