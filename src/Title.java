public abstract class Title {
    // Titelnavn for værket
    private String title;

    // Litteraturtype, f.eks. "BI" for børnebøger, "SKØN" for skønlitteratur
    private String literatureType;

    // Antal kopier af værket
    int copies;

    // Statisk rate, som bruges til beregning af betaling pr. point
    public static double rate = 0.067574;

    // Konstruktør, der initialiserer titel, litteraturtype og antal kopier
    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    // Abstrakt metode til at beregne det samlede antal point for værket
    public abstract double calculatePoints();

    // Abstrakt metode til at beregne point pr. side eller minut afhængigt af litteraturtypen
    public abstract double calculateLiteraturePoints();

    // Getter til at hente litteraturtypen
    public String getLiteratureType() {
        return literatureType;
    }

    // Getter til at hente titlen på værket
    public String getTitle() {
        return title;
    }
}