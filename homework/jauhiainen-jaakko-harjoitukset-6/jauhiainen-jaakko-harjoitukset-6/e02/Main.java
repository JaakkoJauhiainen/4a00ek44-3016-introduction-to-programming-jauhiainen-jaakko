package e02;

import java.io.Console;

class Main {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Anna koko"); 
        String koko = c.readLine();

          int pituus = Integer.parseInt(koko); 

        char[] taulukko = new char[pituus]; 

        for (int i = 0; i < taulukko.length; i++){ 
            System.out.println("Anna merkit:");
            String merkki = c.readLine();
            taulukko[i] = merkki.charAt(0);
        }



         for (int a = 0; a < taulukko.length; a++){  
            System.out.print(taulukko[a] + " ");
        }

    }
}