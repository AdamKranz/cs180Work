public class Car {

    private String make;

    public Car(String make) {
        this.make = make;
    }
    
    public String getMake() {
        return make;
    }

    public void drive() {
        System.out.println("Vroom...");
    }
    
}