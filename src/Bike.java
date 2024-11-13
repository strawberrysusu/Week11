public class Bike {
    // Fields to represent bike properties
    private String brand;
    private String color;
    private int gear;

    // Constructor to initialize bike properties
    public Bike(String brand, String color, int gear) {
        this.brand = brand;
        this.color = color;
        this.gear = gear;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    // Method to display bike details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Gear: " + gear);
    }

    // Main method to test the Bike class
    public static void main(String[] args) {
        Bike myBike = new Bike("Trek", "Red", 5);
        myBike.displayDetails();
    }
}
