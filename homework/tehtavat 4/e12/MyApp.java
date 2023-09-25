
class MyApp {
    public static void main(String [] args) { 
      String luku1str = (args[0]);     
      String operaattori = (args[1]);     
      String luku2str = (args[2]);   

      int luku1 = Integer.parseInt(luku1str);  
      int luku2 = Integer.parseInt(luku2str);  

    if (operaattori.equals("+")) {
        System.out.println(luku1 + luku2);
        }

    if (operaattori.equals ("-")){
        System.out.println(luku1 - luku2);
        }

    if (operaattori.equals ("x")){
        System.out.println(luku1 * luku2);
        }

    if (operaattori.equals ("/")){
        System.out.println(luku1 / luku2);
        }
          
    }
}