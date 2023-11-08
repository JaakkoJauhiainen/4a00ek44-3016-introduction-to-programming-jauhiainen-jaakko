package e09;

public class Main {
    public static void main(String[] args) {
        
        Ohjelmoija tapani = new Ohjelmoija("Tapani", 3000);
       
        Ohjelmoija tiina = new Ohjelmoija("Tiina", 7000);

        tapani.lisaanny(3000); // "Tapani - ohjelmoija yrittää lisääntyä
        
        tiina.lisaanny(7000); // "Tiina - ohjelmoija lisääntyy"

    }
}

// HUOMIO EN SAANUT TÄTÄ TOIMIMAAN ILMAN ETTÄ ANTAA ARVOJA TOHON PERÄÄN

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

   
}


class Ohjelmoija extends Ihminen {

    public Ohjelmoija(String n, int p) { // rakennin
        super(n);  //Välitä super-komennolla n-muuttuja yläluokan rakentimelle.
        setPalkka(p); // Asetetaan palkka turvallisesti
    }
   
    private int palkka;


 public void setPalkka(int p){
        if (p >=1000 && p <= 10000){
            this.palkka = p;
        } else {
            System.out.println("Palkka väliltä 1000 - 10000");
        }
 }
public void lisaanny(int p) {       
        if(p > 5000) {
            this.palkka = p;
            System.out.println("Ohjelmoija lisaantyy");
        } else  {
            System.out.println("Ohjelmoija yrittää lisaantya");
        }
   }

   public int getPalkka(){
         return this.palkka;
   }


   

   
}
