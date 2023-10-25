import java.io.Console;

public class Main {
    public static void main(String [] args) {
        Console c = System.console();

        System.out.println("Anna luku:");
        int luku= Integer.parseInt(c.readLine());

        System.out.println( 1 + 2 + 3 + 4 + luku);

        }
}