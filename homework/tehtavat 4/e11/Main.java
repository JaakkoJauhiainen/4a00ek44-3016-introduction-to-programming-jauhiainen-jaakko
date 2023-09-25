import java.io.Console;
import java.util.Random;  // tää oli joku juttu mil sai toin random new random jutu toimii oli vaikee

class Main {
    public static void main(String[] args) {
        Console c = System.console();

        String[] valinnat = {"kivi", "paperi", "sakset"};  // tehdään taulukko 

        Random satunnainen = new Random(); // muuttuja random satunnainen 

        int i = satunnainen.nextInt(3); // heittää randomille 0-2

        
        System.out.println(valinnat[i]); // Tulostetaan valinta taulukosta
    }
}