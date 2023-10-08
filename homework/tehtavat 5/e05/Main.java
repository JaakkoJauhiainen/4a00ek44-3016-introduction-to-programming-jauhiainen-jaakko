import java.io.Console;

class E5 {
    public static void main(String [] args) {
        Console c = System.console();
        System.out.println("Anna luku1:");
        String luku1String = c.readLine();
        System.out.println("Anna luku2:");
        String luku2String = c.readLine();

        int luku1 = Integer.parseInt(luku1String);
        int luku2 = Integer.parseInt(luku2String);

    laske(luku1, luku2);


    }
    public static void laske(int luku1, int luku2) {
        System.out.println(luku1 + luku2);
    }
}