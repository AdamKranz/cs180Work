public class car {

    private String make;

    public car(String make) {
        this.make = make;
    }
    
    public String getMake() {
        return make;
    }

    public void drive() {
        System.out.println("Vroom...");
    }
    
}