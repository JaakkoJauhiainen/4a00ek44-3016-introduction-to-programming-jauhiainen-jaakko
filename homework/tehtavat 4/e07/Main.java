
class Main {
    public static void main(String [] args) {
       // luodaan taulukko jonka koko on 3. Sisältää 3 nollaa
       String [] taulukko = new String[3];  

       // korvataan nollat arvoilla 101, 200 ja 999     
       taulukko[0] = "Kalle";
       taulukko[1] = "Pekka";
       taulukko[2] = "Jussi";
       
       // tulostetaan arvot
        for(int i = 0; i < taulukko.length; i = i + 2 ) {

        System.out.println(taulukko[i]);  
       }

       // yhdellä rivillä taulukon luonti, koon antaminen ja arvojen antaminen
       //int [] toinen = {3,4,5,6};
       
       // taulukon koko
      // System.out.println(toinen.length);
    }
}
