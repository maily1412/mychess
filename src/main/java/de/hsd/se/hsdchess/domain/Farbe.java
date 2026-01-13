package de.hsd.se.hsdchess.domain;

public enum Farbe {
    /**
     * Weiße Spielfarbe.
     */
    WEISS("#FFFFFF", "W"),

    /**
     * Schwarze Spielfarbe.
     */
    SCHWARZ("#000000", "S");

    /**
     * Hexadezimalcode der Farbe.
     */
    private final String hexCode;

    /**
     * Kurzbeschreibung der Farbe.
     */
    private String beschreibung;

    /**
     * Erstellt die Farbkonstante mit zugehörigem Hexagonalcode und Textbeschreibung.
     * @param _hexCode Hexagonalcode
     * @param _beschreibung Textbeschreibung
     */
    private Farbe(String _hexCode, String _beschreibung) {
        hexCode = _hexCode;
        beschreibung = _beschreibung;
    }

    public String toString() {
        return beschreibung;
    }
}
