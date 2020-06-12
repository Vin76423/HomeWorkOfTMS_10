public class SomeException extends Exception {
    private int a;
    private String model;

    public SomeException(int a, String model) {
        this.a = a;
        this.model = model;
    }

    public SomeException() {
    }

    @Override
    public String getMessage() {
        return a + " - четное, значит попытка завести " + model + " провалилась";
    }
}
