package de.hsd.se.hsdchess.domain;

public class Regelverstoss extends Exception{
    /**
     * Erstellt eine neue Regelverstoß-Exception mit einer Fehlermeldung.
     *
     * @param nachricht Beschreibung des Regelverstoßes
     */
    public Regelverstoss(String nachricht) {
        super(nachricht);
    }
}
