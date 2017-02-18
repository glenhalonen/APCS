
/**
 * Contains Fibonacci contructor for fibonacci object in FibonacciTester class. Includes a 
 * mutator method that calculates and returns the Fibonacci number.
 * 
 * @author Glen Halonen 
 * @version 02/04/2017
 */
public class Fibonacci
{
    /**
     * Constructor for fibonacci object (no parameters)
     */
    Fibonacci()
    {
        
    }
    
    /**
     * Mutator method that calculates the Fibonacci number for the user inputed integer.
     * @param fibo input that is used to calculate the nth Fibonacci value.
     * @return the value of the nth Fibonacci number.
     */
    public int calcFibonacci(int fibo)
    {
        if(fibo == 0)
        {
            return 0;
        }
        else if(fibo == 1)
        {
            return 1;
        }
        
        return calcFibonacci(fibo - 1) + calcFibonacci(fibo - 2);
    }
}
