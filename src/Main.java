import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Laver en ArrayList med to forskellige Author
        ArrayList<Author> authors = new ArrayList<>();

        Author author1 = new Author("J.K. Rowling");
        Author author2 = new Author("Ib Spang Olsen");

        authors.add(author1);
        authors.add(author2);

        //Tilføjer bøger til de to Author
        Title book1 = new PrintedBook("Harry Potter og De Vises Sten", "BI", 140, 360);
        Title book2 = new PrintedBook("Harry Potter og Hemmelighedernes Kammer", "SKØN", 57, 339);
        Title book3 = new AudioBook("Harry Potter og Fangen fra Azkaban", "SKØN", 40, 120);
        Title book4 = new PrintedBook("Den store Kul-Tur", "BI", 78, 15);
        Title book5 = new AudioBook("Karius og Bakus", "BI", 12, 64);

        //Tildeler Author bøger
        author1.addTitle(book1);
        author1.addTitle(book2);
        author1.addTitle(book3);
        author2.addTitle(book4);
        author2.addTitle(book5);

        //Laver et for-each loop til at iterere gennem alle forfattere i listen 'authors'
        //For hver forfatter udskrives navnet og den samlede betaling (afrundet til 2 decimaler)
        for (Author author : authors) {
            System.out.println(author.getName() + ": " + String.format("%.2f", author.calculateTotalPay()) + " kr.");
        }
    }
}