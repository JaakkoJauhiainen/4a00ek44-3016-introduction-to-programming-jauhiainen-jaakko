import java.io.Console;

class E5 {
    public static void main(String [] args) {
        Console c = System.console();

        System.out.println("Anna korkeus:");
        String lukuString = c.readLine();

        int luku = Integer.parseInt(lukuString);
        

    laske(luku);


    }
    public static void laske(int luku) {
        
        for (int i = 0 ; i < luku; i++){
            for (int a = 0; a < luku; a++){
            System.out.print("X");
        }
        System.out.println("");
        }
        
    }
}