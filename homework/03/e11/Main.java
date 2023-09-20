import java.io.Console;

public class Main {
    public static void main(String [] args) {
        Console c = System.console();
      System.out.println("Anna luku");
        int luku1 = Integer.parseInt(c.readLine());   // int luku1 = Integer.parseInt("55")

        System.out.println("Anna operaattori");
        String operaattori =(c.readLine());

        System.out.println("Anna toinen luku");
        int luku2 = Integer.parseInt(c.readLine());

        if (operaattori.equals("/")) {              // if (nimi.equals("lopeta")) {
            System.out.print(luku1 / luku2);
        }
        if (operaattori.equals("+")) {
            System.out.print(luku1 + luku2);

            }

            if (operaattori.equals("-")) {
            System.out.print(luku1 - luku2);
        }

        if (operaattori.equals("*")) {
            System.out.print(luku1 * luku2);
        }
        
}
    }
