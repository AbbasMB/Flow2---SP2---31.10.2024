import java.util.ArrayList;

public class Author {
    // Navn på forfatteren
    private String name;

    // Liste over titler skrevet af forfatteren
    private ArrayList<Title> titles;

    // Konstruktør, der initialiserer forfatterens navn og opretter en tom liste af titler
    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    // Tilføjer en titel til forfatterens liste af titler
    public void addTitle(Title title) {
        titles.add(title);
    }

    // Beregner den samlede betaling for forfatteren baseret på titlernes point og raten
    public double calculateTotalPay() {
        double totalPoints = 0;
        for (Title title : titles) {
            totalPoints += title.calculatePoints();
        }
        return totalPoints * Title.rate;
    }

    // Getter til at hente forfatterens navn
    public String getName() {
        return name;
    }
}