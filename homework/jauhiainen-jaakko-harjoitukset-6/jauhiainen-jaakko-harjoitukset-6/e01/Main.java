package e01;

import java.io.Console;

class Main {
    public static void main(String[] args) {
        Console c = System.console();



        String[] taulukko = new String[10];     // tee taulukko jonka pituus on 10
       
        for (int i = 0; i < taulukko.length; i++){  // kysytään 10 kertaa käyttäjältä numerot
            System.out.println("Anna numerot:");
            String num = c.readLine();
            taulukko[i] = num;  
        }

         for (int a = 0; a < taulukko.length; a++){  // tulostetaan taulukon paikat järjestyksessä: taulukko[1] = joku numero; taulukko[2] = joku numero jne jne
            System.out.print(taulukko[a] + " ");
        }

    }
}