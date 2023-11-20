public class Main {
    public static void main(String[] args) {
        Car datsun = new Car("Datsun 100a");

        Car.Motor motor = datsun.getMotor();

        motor.printCarBrand();
    }
}


class Car {
    private String brand;
    private Motor motor;

    public Motor getMotor() {
        return this.motor;
    }

    class Motor {
        public void printCarBrand() {
            System.out.println(brand);
        }
    }

    public Car(String brand) {
        this.brand = brand;
        this.motor = new Motor();
    }
}

