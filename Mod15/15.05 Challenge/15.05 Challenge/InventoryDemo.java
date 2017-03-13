/**
 * InventoryDemo is the tester class that creates objects of type product. Uses takeInventory method 
 * to find and print the inventory of the String being passed in. 
 * 
 * 
 * @author Glen Halonen
 * @version 03/12/17
 */
import java.util.*;
public class InventoryDemo 
{
    public static List<Product> product = new ArrayList<Product>();
    public static void main(String args[])
    {
        product.add( new Car(1000000, "Jaguar")   );
        product.add( new Car(17000, "Neon")       );
        product.add( new Tool(149.18, "JigSaw")   );
        product.add( new Car(1100000, "Jaguar")   );
        product.add( new Car(17500, "Neon")       );
        product.add( new Car(17875.32, "Neon")    );
        product.add( new Truck(35700, "Ram")      );
        product.add( new Tool(200, "CircularSaw") );
        product.add( new Tool(150, "CircularSaw") );
        
        String s = "Neon";
        takeInventory(s);
        s = "Jaguar";
        takeInventory(s);
        s = "circularsaw";
        takeInventory(s);
        
        Tool saw1 = new Tool(250, "SAW1");
        Tool saw2 = new Tool(251, "SAW2");
        
        if( saw1.compareTo(saw2) == 0) 
        {
            System.out.println("Both saws are the same price.");
        }
        else if( saw1.compareTo(saw2) < 0) 
        {
            System.out.println(saw2.getName() + " is more expensive.");
        }
        else
        {
            System.out.println(saw1.getName() + " is more expensive.");
        }
    }
    
    public static void takeInventory(String p)
    {
        int quantity = 0;
        double cost = 0;
        String productName = "";
        for (int i = 0; i < product.size(); i++)
        {
            if(product.get(i).getName().equalsIgnoreCase(p))
            {
                quantity++;
                cost += product.get(i).getCost();
                productName = product.get(i).getName();
            }
        }
        
        System.out.println(productName + ": Quantity: " + quantity + " Total Cost: " + cost);
    }
}
