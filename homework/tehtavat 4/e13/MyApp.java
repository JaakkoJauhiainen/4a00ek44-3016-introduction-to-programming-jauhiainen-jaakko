
class MyApp {
    public static void main(String [] args) {

      String luku1str = (args[0]);         // kysytään käyttäjältä luku

      int luku1 = Integer.parseInt(luku1str);  // muutetaan se kokonaisluvuksi


        int[] taulukko = new int[10]; // tehdään taulukko johon mahtuu 10 kokonaislukua
       
        for (int i = 0; i < 10; i++){ 
             int satunnainenLuku = (int) (Math.random() * 100 + 1); // luvut 1 - 100 randomilla
            taulukko[i] = satunnainenLuku; // esim taulukko[1] 666 -> taulukko[2] -> 420 taulukko[3] -> 808 jne

            if (satunnainenLuku == luku1 ) { // jos satunnainenluku on sama kuin käyttäjän tulosta ja lopeta
                System.out.println("Löytyi!"); // jos ei niin luuppia käydään 10 kertaa ja jos ei löydy sit ei voi mitää
                break;
            } 
            
        }

    }
}
