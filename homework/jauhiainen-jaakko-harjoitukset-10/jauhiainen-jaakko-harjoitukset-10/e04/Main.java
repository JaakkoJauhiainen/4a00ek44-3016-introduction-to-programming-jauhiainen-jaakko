package e04;

public class Main {
    public static void main(String[] args) {
        Ihminen ukko1 = new Ohjelmoija("Ohjelmoija ");
        Ihminen ukko2 = new Ihminen("Ihminen ");

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

   public Ihminen(String n) {
        this.nimi = n;
    }

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

    public Ohjelmoija(String n) {
        super(n);
    }
   
    public void osallistuCyberGothDanceJuhlaan(){
        System.out.println(getNimi() + " ohjelmoi ");
    }

    public void ohjelmoi() {
        System.out.println(getNimi() + "oispa kaliaa ");
    }
}
