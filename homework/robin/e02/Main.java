import java.io.Console;

public class Main {
    public static void main(String [] args) {
        Console c = System.console();
        System.out.println("Anna luku:");
         int luku1= Integer.parseInt(c.readLine());

         System.out.println("Anna luku:");
         int luku2= Integer.parseInt(c.readLine());

    tarkistus(luku1,luku2);


    }
    public static void tarkistus(int luku1, int luku2) {
        int summa = luku1 + luku2;

        if (summa == 10) {
            System.out.println("oli kymppi");
        }else{
            System.out.println("ei ollu");
        }
    }
}