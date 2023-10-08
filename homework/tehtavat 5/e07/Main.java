// tulosta => System.out.println()
// palauta => return


import java.io.Console;

class E5 {
    public static void main(String [] args) {
             
        Console c = System.console();


        System.out.println("Anna merkki:");
        char merkki = c.readLine().charAt(0);
        System.out.println("Anna luku:");
        String lukuString = c.readLine();

        int luku = Integer.parseInt(lukuString);
        

        System.out.println(laske(merkki, luku));


    }
    public static String laske(char merkki, int luku) {
        String palautus = "";
        for(int i = 0; i < luku; i++){
            palautus += merkki;
        }
        return palautus;
        
    }
}