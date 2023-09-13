import java.io.Console;

class Main {
    public static void main(String [] args) {
        Console c = System.console();
        
        String muistio ="";
        System.out.println("Anna nimi");
        String nimiyks = c.readLine();
        muistio += nimiyks;

        while (true) {
            System.out.println("Anna nimi tai lopeta");
            String nimi = c.readLine();
            if (nimi.equals("lopeta")) {
                break;
            } else {
                muistio += nimi;
            }
            System.out.println(muistio);
        }

    }
}