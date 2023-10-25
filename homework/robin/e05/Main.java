import java.io.Console;

public class Main {
    public static void main(String [] args) {
        Console c = System.console();
        System.out.println("Anna nimi:");
        String nimi = (c.readLine());

        while (nimi.length() < 2){
            System.out.println("Anna nimi:");
            nimi = (c.readLine());
        }
        System.out.println("Annoit nimen " + nimi);


        }
}