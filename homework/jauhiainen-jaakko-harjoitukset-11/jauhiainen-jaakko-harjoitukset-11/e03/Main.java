class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Strutsilintu strutsi = new Strutsilintu();
        lennä(bird);
        lennä(strutsi);
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


