import java.util.Random;

public class Car {
    private String model;
    private int sped;
    private int price;
    private Random random = new Random();

    public Car(String model, int sped, int price) {
        this.model = model;
        this.sped = sped;
        this.price = price;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSped() {
        return sped;
    }

    public void setSped(int sped) {
        this.sped = sped;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start() throws SomeException{
        int number = random.nextInt(20);

        if (number % 2 == 0) throw new SomeException(number, model);

        System.out.println(model + " завелся");
    }
}
