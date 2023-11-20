class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Strutsilintu strutsi = new Strutsilintu();
        Anonymous nimeton = new Anonymous();
        lennä(bird);
        lennä(strutsi);

        
    Bird x = new Bird() {
    @Override
    public void lennä() {
        System.out.println("Anonyymi lentää");
    }
};
    x.lennä();

        
    }

    public static void lennä(Bird b) {
        b.lennä();
    }
}

class Bird {
    public void lennä() {
        System.out.println("lintu lentää");
    }
}

class Strutsilintu extends Bird {
    @Override
    public void lennä() {
        System.out.println("strutsi yrittää lentää");
    }
}


class Anonymous extends Bird {
    @Override
    public void lennä() {
        System.out.println("Anonyymi lentää");
    }   
}




