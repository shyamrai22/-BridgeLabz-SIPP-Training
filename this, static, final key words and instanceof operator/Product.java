package oops_day_03_package;

public class Product {
	
	   // Static variable shared by all products
	   private static double discount = 0.0;
	   
	   // Instance variable
	   private final String productID; // Final variable
	   
	   private String productName;
	   private double price;
	   private int quantity;
	   
	   // Constructor
	   public Product(String productID, String productName, double price, int quantity) {
	       this.productID = productID;
	       this.productName = productName;
	       this.price = price;
	       this.quantity = quantity;
	   }
	   
	   // Static method to update the discount percentage
	   public static void updateDiscount(double newDiscount) {
	       if (newDiscount >= 0.0 && newDiscount <= 100.0) {
	           discount = newDiscount;
	       } else {
	           System.out.println("Invalid discount percentage. Please enter a value between 0 and 100.");
	       }
	   }
	   
	   // Method to calculate the price after applying the discount
	   public double getDiscountedPrice() {
	       return price - (price * discount / 100);
	   }
	   
	   // Method to display product details
	   public void displayProductDetails() {
	       if (this instanceof Product) {
	           System.out.println("Product ID: " + productID);
	           System.out.println("Product Name: " + productName);
	           System.out.println("Price: Rs" + price);
	           System.out.println("Quantity: " + quantity);
	           System.out.println("Discount: " + discount + "%");
	           System.out.println("Price after Discount: Rs" + getDiscountedPrice());
	       } else {
	           System.out.println("The object is not an instance of the Product class");
	       }
	   }
	   
	   // Getters and setters
	   public String getProductID() {
	       return productID;
	   }
	   public String getProductName() {
	       return productName;
	   }
	   public void setProductName(String productName) {
	       this.productName = productName;
	   }
	   public double getPrice() {
	       return price;
	   }
	   public void setPrice(double price) {
	       this.price = price;
	   }
	   public int getQuantity() {
	       return quantity;
	   }
	   public void setQuantity(int quantity) {
	       this.quantity = quantity;
	   }
	   
	   //Main Method
	   public static void main(String[] args) {
	       Product.updateDiscount(10.0); 
	      
	       Product product1 = new Product("P1", "Desktop", 150000.00, 50);
	       Product product2 = new Product("P2", "Tablet", 70000.00, 100);
	       
	       product1.displayProductDetails();
	       System.out.println();
	       product2.displayProductDetails();
	   }
	}
