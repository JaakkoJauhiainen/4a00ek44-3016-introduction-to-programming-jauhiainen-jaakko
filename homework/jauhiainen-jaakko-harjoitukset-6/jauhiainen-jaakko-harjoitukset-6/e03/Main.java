package e03;

import java.time.LocalDate;

class Main {
    public static void main(String [] args) {
        tulostaPaivamaara();
    }

    public static void tulostaPaivamaara() {
        LocalDate paivamaara = LocalDate.now();

        System.out.println(paivamaara);
    }
}
