import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();

        int[][] taulukko = new int[2][3];

        // for loopp jossa täytetään taulukot

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Anna lukema taulukkoon: " + i + "," + j + ": ");
                taulukko[i][j] = Integer.parseInt(c.readLine());
            }
        }
        // kutsuu metodia
    printTwoDimArray(taulukko);
        
    }

// alla metodi joka tulostaa taulukon
    public static void printTwoDimArray(int [][] myarray) {
            for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(myarray[i][j]);
            }
            System.out.println();
        }

    }
}