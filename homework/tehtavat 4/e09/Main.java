
import java.io.Console;

class Main {
    public static void main(String[] args) {
        Console c = System.console();

        String pisinnimi = "";  // tehdään tyhjä muuttuja johon tulee myöhemmin pisin nimi
        System.out.println("Kuinka monta nimea laitetaan listaan?"); 
        String luku = c.readLine();

          int pituus = Integer.parseInt(luku); // muutetaan annettu luku intiksi

        String[] taulukko = new String[pituus]; // tehdään annetusta luvusta sen pituinen taulukko
       
        for (int i = 0; i < taulukko.length; i++){ // forluuppi jossa tallennetaan taulukkoon niin monta nimeä
            System.out.println("Anna nimet:");
            String nimet = c.readLine();
            taulukko[i] = nimet;  //taulukko[1] = pekka taulukko[2] = jussi jne jne jne 
        }
              for (int a = 0; a < taulukko.length; a++) {
            if (taulukko[a].length() > pisinnimi.length()) { //tallennetaan ensiksi tyhään pisinnimi muuttujaan
                pisinnimi = taulukko[a];      //ensimmäinen nimi jota sitten verrataan uuteen nimeen
                // LOOP 1 :taulukko[1] jukka > " " <-- tyhjä koska muuttuja asetettiin alussa tyhjäksi
                // LOOP 2: taulukko[2] moi > jukka <--- taulukko[1]; ei pidä paikkansa joten pisinnimi ei päivity 
            }
    }
    System.out.println("pisin nimi on " + pisinnimi); // tulostetaan pisin nimi
    }
}
