
class Rectangle {
    public int width = 5;      // = 0
    public int height = 3 ;    // = 0
}

class TestRectangle {
    public static void main(String [] args) {
        // Olion jaska luonti
        Rectangle a = new Rectangle();
        Rectangle b = new Rectangle();

        System.out.println(a);  // koodi tulostaa kärpäsenpaskaa, eli ilmeisesti rectangle "a" muistipaikan osoitteen
        System.out.println(b); // tulostaa koodi uuden muistipaikan osoitteen
    }
}