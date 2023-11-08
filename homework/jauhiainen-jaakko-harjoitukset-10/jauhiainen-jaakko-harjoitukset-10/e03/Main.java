package e03;

public class Main {  // tää o ny se TESTI luokka en jaksanu säätää ton nimen kaa ko kone sekoo jos muokkaan tätä tiedosto nimee idk bro
    public static void main(String[] args) {
        Ihminen ukko1 = new Ohjelmoija();
        Ihminen ukko2 = new Ihminen();

        ukko1.setNimi("Ohjelmoija ");
        ukko2.setNimi("Ihminen ");


        ukko1.nuku();
        ukko1.syo();
        ukko1.juo();
        ukko1.lisaanny();
        ((Ohjelmoija) ukko1).osallistuCyberGothDanceJuhlaan();
        ((Ohjelmoija) ukko1).ohjelmoi();

        ukko2.nuku();
        ukko2.syo();
        ukko2.juo();
        ukko2.lisaanny();
    }
}

class Ihminen {

   private String nimi;

    public void setNimi(String n) {
        this.nimi = n;
    }

    public String getNimi() {
        return this.nimi;
    }

    public void nuku() {
        System.out.println(getNimi() + "NUKKUU ");
    }

    public void syo() {
        System.out.println(getNimi() + " syö");
    }

    public void juo() {
        System.out.println(getNimi() + " juo");
    }

    public void lisaanny() {
        System.out.println(getNimi() + "lisääntyy");
    }
}


class Ohjelmoija extends Ihminen {
   
    public void osallistuCyberGothDanceJuhlaan(){
        System.out.println(getNimi() + " ohjelmoi ");
    }

    public void ohjelmoi() {
        System.out.println(getNimi() + "oispa kaliaa ");
    }
}
