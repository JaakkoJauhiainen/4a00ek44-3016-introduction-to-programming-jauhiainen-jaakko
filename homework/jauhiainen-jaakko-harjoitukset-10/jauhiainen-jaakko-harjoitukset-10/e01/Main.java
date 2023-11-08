package e01;

public class Main {
    public static void main(String[] args) {
        Ihminen ukko1 = new Ihminen();
        Ihminen ukko2 = new Ihminen();

        ukko1.nuku();
        ukko1.syo();
        ukko1.juo();
        ukko1.lisaanny();

        ukko2.nuku();
        ukko2.syo();
        ukko2.juo();
        ukko2.lisaanny();
    }
}

class Ihminen {
    public void nuku() {
        System.out.println("Ihminen nukkuu");
    }

    public void syo() {
        System.out.println("Ihminen syö");
    }

    public void juo() {
        System.out.println("Ihminen juo");
    }

    public void lisaanny() {
        System.out.println("Ihminen lisääntyy");
    }
}
