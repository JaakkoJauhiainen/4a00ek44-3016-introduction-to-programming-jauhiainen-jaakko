import java.io.Console;

class Main {
    public static void main(String [] args) {
        Console c = System.console();

        String [] taulukko = new String[10];

  
        
    for (int i = 0; i < 10; i++){
            System.out.println("Anna 10 numeroa:");
            String numero = c.readLine();
            taulukko[i] = numero;
        }
               for (int i = 0; i < taulukko.length; i++) {
                 System.out.println(taulukko[i]);
}


    

    }
}