package e04;

import java.time.LocalDate;     // tän avulla saa java kirjastosta oikean päivämäärän t google
class Main {
    public static void main(String [] args) {
        System.out.println( palautaPaivamaara() );
    }
    
    public static LocalDate palautaPaivamaara() {
        LocalDate paivamaara = LocalDate.now();  // tää tekee olion paivamaara joka on aina nykyinen päivä, localdate.now päivittää sitä sit tai jotai
        return paivamaara;
    }

    }
