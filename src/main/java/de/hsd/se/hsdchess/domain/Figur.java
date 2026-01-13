package de.hsd.se.hsdchess.domain;

/**
 * Superklasse aller Schachfiguren.
 */
public class Figur {

    /**
     * Figurfarbe WEISS / SCHWARZ.
     */
    public Farbe figurFarbe;

    /**
     * Figurposition a-h, 1-8.
     */
    public Position figurPosition;

    /**
     * Wert, ob die Figur (noch) im Spiel ist.
     */
    public boolean imSpiel = true;

    /**
     * Zähler, der hochzählt, wie oft eine Figur bewegt wurde.
     */
    public int zaehlerWieOftBewegt;

    /**
     * Erzeugt eine Figur mit Farbe und Postion. Wirft bei falscher Position einen Regelverstoss.
     * @param _figurFarbe WEISS / SCHWARZ
     * @param _figurPosition a-h, 1-8
     * @throws Regelverstoss wenn Startposition falsch
     */
    public Figur(Farbe _figurFarbe, Position _figurPosition) {
        figurFarbe = _figurFarbe;
        figurPosition = _figurPosition;
        zaehlerWieOftBewegt = 0;
    }
    
}
