import java.io.Console;

public class Main {
    public static void main(String [] args) {
        Console c = System.console();
      System.out.println("Anna luku");
        int luku1 = Integer.parseInt(c.readLine());   // int luku1 = Integer.parseInt("55")

        System.out.println("Anna toinen luku");
        int luku2 = Integer.parseInt(c.readLine());
        
        for(int i = luku1; i <= luku2; i++) {
            System.out.println(i);

        }

    }
}