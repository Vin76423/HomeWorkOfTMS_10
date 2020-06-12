import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 250, 2450);
        Car car2 = new Car("Mercedes", 260, 2750);
        Car car3 = new Car("BMW", 275, 2320);

        try {
            car1.start();
        } catch (SomeException e) {
            System.out.println(e.getMessage());
        }

        try {
            car2.start();
        } catch (SomeException e) {
            System.out.println(e.getMessage());
        }

        try {
            car3.start();
        } catch (SomeException e) {
            System.out.println(e.getMessage());
        }
    }
}

