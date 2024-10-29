public class PrintedBook extends Title {
    // Antal sider i bogen
    int pages;

    // Konstruktør, der initialiserer titel, litteraturtype, antal kopier og antal sider
    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    // Beregner point for bogen baseret på antal sider, litteraturtype og antal kopier
    @Override
    public double calculatePoints() {
        return pages * calculateLiteraturePoints() * copies;
    }

    // Beregner point pr. side afhængigt af litteraturtypen
    @Override
    public double calculateLiteraturePoints() {
        switch (getLiteratureType()) {
            case "BI", "TE":
                return 3;
            case "LYRIK":
                return 6;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1;
        }
        return 0;
    }
}

