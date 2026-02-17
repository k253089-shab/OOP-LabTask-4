import java.util.Scanner;

class Laptop{
    private String brand;
    private String model;
    private double price;
    private int stock;

    public Laptop() {
        this.brand = "Unknown";
        this.model = "Generic";
        this.price = 0.0;
        this.stock = 0;
    }

    public Laptop(String brand, String model, double price, int stock) {
        this.brand = brand;
        this.model = model;
        this.setPrice(price);
        this.setStock(stock);
    }

    public Laptop(Laptop other) {
        this.brand = other.brand;
        this.model = other.model;
        this.price = other.price;
        this.stock = other.stock;
    }


    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        if (price >= 0)
            this.price = price;
        else
            System.out.println("Invalid Price!");
    }

    public int getStock(){
        return stock; }
    public void setStock(int stock){
        if (stock >= 0)
            this.stock = stock;
        else
            System.out.println("Invalid Stock count!");
    }

    public void removeLaptop() {
        System.out.println("Removing Laptop: " + this.brand + " " + this.model + " from inventory...");
    }

    public void displayInfo() {
        System.out.println(String.format("Laptop: [%s %s] | Price: $%.2f | Stock: %d", 
                           brand, model, price, stock));
    }
}

public class Main
{
	public static void main(String[] args) {
		Laptop laptop1 = new Laptop("Dell", "XPS 15", 1500.00, 10);
        
        Laptop laptop2 = new Laptop(laptop1);
        laptop2.setModel("XPS 15 - Refurbished");
        laptop2.setPrice(1200.00);

        System.out.println("--- Current Inventory ---");
        laptop1.displayInfo();
        laptop2.displayInfo();

        System.out.println("\n--- Maintenance ---");
        laptop1.removeLaptop();
	}
}
