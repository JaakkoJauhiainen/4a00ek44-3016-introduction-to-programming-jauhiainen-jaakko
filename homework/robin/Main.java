import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();
        int summa = 0;
        int lukuja = 0;

        while (true) {  // Ikuisesti pyörivä silmukka, kunnes käyttäjä antaa negatiivisen luvun
            System.out.println("Anna positiivinen kokonaisluku (negatiivinen lopettaa):");
            int luku = Integer.parseInt(c.readLine());

            if (luku < 0) {
                break;  // Keskeytä silmukka, jos luku on negatiivinen
            }

            summa += luku;
            lukuja++;
        }

        if (lukuja > 0) {
            double keskiarvo = (double) summa / lukuja;  // Muunnetaan summa double-tyypiksi saadaksemme desimaalit mukaan keskiarvoon
            System.out.println("Annattujen lukujen keskiarvo on: " + keskiarvo);
        } else {
            System.out.println("Ei annettuja lukuja.");
        }
    }
}
