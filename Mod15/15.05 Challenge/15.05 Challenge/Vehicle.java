
/**
 * Abstract class Vehicle - takes two parameters and contains methods getName and getCost.
 * 
 * @author Glen Halonen
 * @version 03/12/17
 */
public abstract class Vehicle implements Product
{
    public double cost;
    private String name;

    public Vehicle( double cost, String name )
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
}
