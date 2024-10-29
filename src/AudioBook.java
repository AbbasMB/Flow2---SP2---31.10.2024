public class AudioBook extends Title {
    // Varighed af lydbogen i minutter
    int durationInMinutes;

    // Konstruktør, der initialiserer titel, litteraturtype, antal kopier og varighed
    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    // Beregner point for lydbogen baseret på varighed, litteraturtype og antal kopier
    @Override
    public double calculatePoints() {
        return (durationInMinutes * 0.5) * calculateLiteraturePoints() * copies;
    }

    // Beregner point pr. minut afhængigt af litteraturtypen
    @Override
    public double calculateLiteraturePoints() {
        switch (getLiteratureType()) {
            case "BI", "TE":
                return 1.5;
            case "LYRIK":
                return 3;
            case "SKØN":
                return 0.85;
            case "FAG":
                return 0.5;
        }
        return 0;
    }
}
