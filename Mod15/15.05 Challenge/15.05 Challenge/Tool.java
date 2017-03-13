
/**
 * Class Tool is a superclass that implements Product and the Comparable t interface. Contains 
 * compareTo method that compares two objects.
 * 
 * @author Glen Halonen 
 * @version 03/12/17
 */
public class Tool implements Product, Comparable <Tool>
{
   private double cost;
   private String name;
   
    public Tool (double cost, String name)
   {
       this.cost = cost;
       this.name = name;
   }
   
   public String getName()
   {
       return name;
   }
   
   public double getCost()
   {
       return cost;
   }
   
   public int compareTo(Tool tool)
   {
       if(cost == tool.cost)
       {
           return 0;
       }
       else if (cost > tool.cost)
       {
           return 1;
       }
       else 
       {
           return -1;
       }
   }
}
