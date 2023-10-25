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

// tulostetaan taulukot
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(taulukko[i][j]);
            }
            System.out.println();
        }
    }
}