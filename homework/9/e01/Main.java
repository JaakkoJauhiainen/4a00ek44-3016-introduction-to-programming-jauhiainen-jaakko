class Rectangle {
    // tietoa, muuttujia, attribuutteja:
    public int width = 5;
    public int height = 3;

    public String toString() {
    return "Width: " + width + ", Height: " + height;
}

}

class TestRectangle {
    public static void main(String [] args) {
        // Olion jaska luonti
        Rectangle a = new Rectangle();
        System.out.println(a);
    }
}
