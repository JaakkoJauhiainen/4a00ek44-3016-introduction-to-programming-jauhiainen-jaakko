import java.io.Console;

public class Main {
    public static void main(String [] args) {
        Console c = System.console();

        System.out.println("Anna luku:");
        int luku1= Integer.parseInt(c.readLine());

        System.out.println("Anna luku:");
        int luku2= Integer.parseInt(c.readLine());

        if (luku1 > luku2) {
            int vaihto = luku1;
            luku1 = luku2;
            luku2 = vaihto;
        }

        for (int i = luku1; i <= luku2; i++) {
            System.out.print(i);
        }

        


        }
}