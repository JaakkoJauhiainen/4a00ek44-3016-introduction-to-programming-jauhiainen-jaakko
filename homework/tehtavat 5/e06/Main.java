import java.io.Console;

class E5 {
    public static void main(String [] args) {
        Console c = System.console();


        System.out.println("Anna merkki:");
        char merkki = c.readLine().charAt(0);
        System.out.println("Anna luku:");
        String lukuString = c.readLine();

        int luku = Integer.parseInt(lukuString);
        

    laske(merkki, luku);


    }
    public static void laske(char merkki, int luku) {
        for(int i = 0; i < luku; i++){
        System.out.print(merkki);
        }
        
    }
}