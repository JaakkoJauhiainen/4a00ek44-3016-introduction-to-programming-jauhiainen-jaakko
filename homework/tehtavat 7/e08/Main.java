import java.io.Console;

class e08 {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.print("Anna neliön korkeus: ");
        int korkeus = Integer.parseInt(c.readLine());

        char [][] taulukko = new char [korkeus][korkeus]; // kaks krt korkeus koska kyseessä neliö

        for (int i = 0; i < korkeus; i++){
            for (int j = 0; j < korkeus; j++){
                if(i==0 || i==korkeus -1 || j == 0 || j == korkeus -1 ){
                taulukko[i][j] = 'X';
                } else {
                    taulukko[i][j] = ' ';
                }
            }

            }

            for (int i = 0; i < korkeus; i++){
                for (int j = 0; j < korkeus; j++){
                    System.out.print(taulukko[i][j]);
                }
                System.out.println();
            }

            }
        }
