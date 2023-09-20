import java.io.Console;

class Main {
    public static void main(String [] args) {
        Console c = System.console();
        
   
        System.out.println("Anna merkkijono joka tarkistetaan onko pallinomi");     // kysytään käyttäjältä sana
        String tarkistus = c.readLine();        // tallennetaan sana muuttujaan
        String pallinomi = "";                  // tähän muuttujaan tallennetaan kirjain kerrallaan sana takaperin
        int pituus = tarkistus.length();        // pidetään kirjaa missä kohtaa sanaa mennään

       for (int i = tarkistus.length(); i > 0; i--) {   // for luuppi jossa mennään annetun sanan määrä takaperin
            pallinomi += tarkistus.charAt(pituus - 1);      // pallinomi muuttujaan lisätään sanasta yksi kirjain takaa päin         
            pituus -= 1;                                    // Mennään annettua sanaa yksi taaksepäin
       }
        if (tarkistus.equals(pallinomi)) {                  // jos sana on palidromi tulosta tämä
            System.out.println("Sana on palidromi!");
               
        }
            else {                                          // jos ei tulosta tämä

                System.out.println("Sana ei ole palidromi");
            }
       

    

    }
}