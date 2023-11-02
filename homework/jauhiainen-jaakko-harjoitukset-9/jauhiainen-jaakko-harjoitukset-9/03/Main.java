
class Rectangle {
    public int width = 5;      // = 0
    public int height = 3 ;    // = 0

    public void printMe() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
}



}

class TestRectangle {
    public static void main(String [] args) {
        // Olion jaska luonti
        Rectangle a = new Rectangle();
        Rectangle b = new Rectangle();

        a.printMe();
        b.printMe();
    }
}