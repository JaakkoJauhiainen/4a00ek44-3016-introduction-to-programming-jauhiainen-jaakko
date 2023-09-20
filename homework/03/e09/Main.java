import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("testaa palindromiasi");
        String sana = c.readLine();
        String korjattu ="";
        String tarkistus = "";

                                //4             //1
        for (int a = 0; a < sana.length(); a++) {
             if (sana.charAt(a)==' '||sana.charAt(a)==','||sana.charAt(a)=='.') {
                continue;
             }
                korjattu += sana.charAt(a);        
            }
        int x = korjattu.length();

                        
        for (int i = korjattu.length(); i > 0; i--) {
            tarkistus += korjattu.charAt(x-1);
            x -= 1;
            }
            if (korjattu.equalsIgnoreCase(tarkistus)){
        System.out.println("sanasi on palidromi!");
        }
        else {
        System.out.println("Sana ei ole palidromi");
        }
    }
}