import java.io.Console;

class Main {
    public static void main(String [] args) {
        Console c = System.console();
      System.out.println("Mika nimesi on?");
        String nimi = c.readLine();
        if (nimi .equals ("Jussi")) {
            System.out.println("Onpas sinulla tyhmä nimi");
          } 
        else System.out.println("Onpas sinul hiano nimi"); 

    }
}