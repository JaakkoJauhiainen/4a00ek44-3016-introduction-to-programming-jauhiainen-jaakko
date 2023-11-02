
class Opiskelija {
    // tietoa, muuttujia, attribuutteja:
    public String nimi;  // = null  -> alustaa oletusarvoisesti..
    public int ika;      // = 0
    public int paino;    // = 0
}

class Main {
    public static void main(String [] args) {
        // Olion jaska luonti
        Opiskelija jaska = new Opiskelija();
        System.out.println(jaska);
    }
}