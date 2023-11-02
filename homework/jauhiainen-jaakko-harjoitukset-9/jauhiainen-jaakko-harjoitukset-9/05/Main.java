
class Rectangle {
    public int width = 5;      // = 0
    public int height = 3 ;    // = 0

    public void printMe() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
}

    public void whoAmI(){

        System.out.println(this); // tulostaa tämän olion viitteen
    }

    
    public void finalize() {
     System.out.println("Deleting: " + this);
}




}

class TestRectangle {
    public static void main(String [] args) {
        // Olion jaska luonti
        Rectangle a = new Rectangle();
        Rectangle b = new Rectangle();
        
        
Rectangle p1 = new Rectangle();  // Ei tuhoa p1 oliota, ei kyll mitää hajuu et miksi
   Rectangle p2 = p1;
   System.out.println(p1);
   p1 = null;
   kaynnistaRoskienKeruu();


        


        a.printMe();
        b.printMe();
        a.whoAmI();
        b.whoAmI();
    }

    public static void kaynnistaRoskienKeruu() {
    // Käynnistetään roskien keruu.
    System.gc();
    // Odotellaan sekunnin verran.
    try {
        Thread.sleep(1000);
    } catch(InterruptedException e) {
        e.printStackTrace();
    }
}

}