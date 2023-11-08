package e08;

public class Main {
    public static void main(String[] args) {
        Ihminen ukko1 = new Ohjelmoija("Jeppe ", 10000);
        Ihminen ukko2 = new Ihminen("Pekka ");

        ukko1.tulostaTiedot();
        ukko2.tulostaTiedot();


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

    public void tulostaTiedot() {
        System.out.println(getNimi() + " Tulostaa ihmisen nimen niinko tehtava 8 piti");
    }
}


class Ohjelmoija extends Ihminen {

    public Ohjelmoija(String n, int p) { // rakennin
        super(n);  //Välitä super-komennolla n-muuttuja yläluokan rakentimelle.
        setPalkka(p); // Asetetaan palkka turvallisesti
    }
   
    public void osallistuCyberGothDanceJuhlaan(){
        System.out.println(getNimi() + getPalkka() + " ohjelmoi ja saa palkkaa ");
    }

    public void ohjelmoi() {
        System.out.println(getNimi() + "oispa kaliaa ");
    }

    private int palkka;


 public void setPalkka(int p){
        if (p >=1000 && p <= 10000){
            this.palkka = p;
        } else {
            System.out.println("Palkka väliltä 1000 - 10000");
        }
        
 }
   public int getPalkka(){
         return this.palkka;
   }

   public void tulostaTiedot(){
    System.out.println(getNimi() + getPalkka() + "Tulostaa nimen ja palkan");
   }
}
