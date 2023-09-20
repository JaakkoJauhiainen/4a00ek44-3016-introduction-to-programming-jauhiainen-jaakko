import java.io.Console;

public class Main {
    public static void main(String [] args) {
        Console c = System.console();
 

      for(int i = 0; i <= 4; i++) {
             double satunnainen = Math.random() * 10;
             int b = (int) satunnainen;
             
            System.out.println(b);         //System.out.println(nimi.charAt(i));

        }

    }
}

