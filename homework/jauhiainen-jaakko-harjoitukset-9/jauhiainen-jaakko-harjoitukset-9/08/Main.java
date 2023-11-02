
class Rectangle {
    private int width;      // = 0
    private int height;    // = 0

    public void printMe() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
}

public int getWidth(){
    return width;
}

 public int getHeight() {
        return height;
    }

    public void setWidth(int width){
       
        if(width < 0) {
            IllegalArgumentException e = new IllegalArgumentException("Give positive values");
            throw e;
        }else{
            this.width = width;
        }
        }



        public void setheight(int height){
        if(height < 0) {
            IllegalArgumentException e = new IllegalArgumentException("Give positive values");
            throw e;
        }else{
            this.height = height;
        }
    }


}

class TestRectangle {
    public static void main(String [] args) {
       
    Rectangle r1 = new Rectangle();
    r1.setWidth(30);
    System.out.println(r1.getWidth()); // 30

    Rectangle r2 = new Rectangle();
    r2.setWidth(-30);
    System.out.println(r2.getWidth()); // 0


    }



}