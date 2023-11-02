
class Rectangle {
    private int width;      // = 0
    private int height;    // = 0



public Rectangle(int width, int height) { //KONSTRUKTORI
        if (width > 0 && height > 0) {
            this.width = width;
            this.height = height;
        } else {
            System.out.println("NÖRTTI");
            
        }
}

public String toString() {
        return "Rectangle [Width: " + width + ", Height: " + height + "]";
    }
}

class TestRectangle {
    public static void main(String [] args) {
       Rectangle r = new Rectangle(50, 50);
       System.out.println(r);

    }



}