
class Rectangle {
    public int width = 5;      // = 0
    public int height = 3 ;    // = 0

    public void printMe() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
}

public int countSurfaceArea() {
        return width * height; // Laske pinta-ala ja palauta se
    }
}

class TestRectangle {
    public static void main(String [] args) {
        // Olion jaska luonti

        Rectangle a = new Rectangle();
        Rectangle b = new Rectangle();
        
        
        int surfaceAreaA = a.countSurfaceArea();
        int surfaceAreaB = b.countSurfaceArea();

        System.out.println("Pinta ala A: " + surfaceAreaA);
        System.out.println("Pinta ala B: " + surfaceAreaB);
    }



}