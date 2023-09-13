import java.io.Console;

class Main {
    public static void main(String [] args) {
        Console c = System.console();
      System.out.println("Anna nimesi");
        String nimi = c.readLine();
        
        for(int i = nimi.length() -1 ; i >= 0; i = i -2) {
            System.out.println(nimi.charAt(i));

        }

    }
}