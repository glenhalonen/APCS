
/**
 * Contains the constructor for objects of type Item. Contains getter methods for all variables
 * and a toString method.
 * 
 * @author Glen Halonen
 * @version 04/05/17
 */
public class Item
{
    private int inStore;
    private double price;
    private String itemID, itemName;
    
    public Item(String itemID, String itemName, int inStore, double price)
    {
        this.itemID = itemID;
        this.itemName = itemName;
        this.inStore = inStore;
        this.price = price;
    }
    
    public String getItemID()
    {
        return itemID;
    }
    
    public String getItemName()
    {
        return itemName;
    }
    
    public int getInStore()
    {
        return inStore;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public String toString()
    {
        System.out.printf("%5s %15s %4s  $%6.2f%n", itemID, itemName, inStore, price);
        return "";
    }
}
