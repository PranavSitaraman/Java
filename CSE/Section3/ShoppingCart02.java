
package Section3;

public class ShoppingCart02
{
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        
        double price = 5.0;
        double tax = 10.0;
        int quantity = 4;
        
        // Declare and assign a calculated totalPrice
        
        double totalPrice = ((double) quantity * price) * (1.0 + tax/100.0);
        
        // Modify message to include quantity 
        
        message = custName+" wants to purchase "+quantity+" "+itemDesc+" costing " + price + " dollars.";

        System.out.println(message);
        
        // Print another message with the total cost

        System.out.println("The total cost including tax is " + totalPrice + " dollars.");
        
    }    
}
