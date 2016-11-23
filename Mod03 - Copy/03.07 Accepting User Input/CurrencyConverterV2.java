
/**
 * Convert from dollars to other currency.
 * 
 * @author Glen Halonen 
 * @version 9/28/16
 */
import java.util.Scanner;
public class CurrencyConverterV2
{
     public static void main(String [ ] args)
    {
        Scanner in = new Scanner(System.in);
       
        double startingUsDollars = 0;		// local variable for US Dollars
        double pesosSpent = 0;            // local variable for Mexican pesos spent
        double pesoExchangeRate = 18.5185;      // local variable for exchange rate of US Dollars to Pesos
        double dollarsSpentInMexico = 0.0;      // local variable for dollars spent in Mexico
        double remainingUsDollars = 0.0;        // local variable for US Dollars remaining
        //remaining variables below here
        double yenSpent =  0;             // local variable for Yen spent
        double yenExchangeRate = 102.0731;       // local variable for exchange rate
        double dollarsSpentInJapan = 0;          // local variable for dollars spent 
        
        double euroSpent = 0;               // local variable for Euro spent
        double euroExchangeRate = 0.88884;       // local variable for exchange rate
        double dollarsSpentInFrance = 0;         // local variable for dollars spent 
        
        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        System.out.println("What is you budget in dollars?");
        startingUsDollars = in.nextDouble();
        
        System.out.println("What is the exchange rate of pesos to US dollars?");
        pesoExchangeRate = in.nextDouble();
        
         System.out.println("What is the exchange rate of yen to US dollars?");
        yenExchangeRate = in.nextDouble();
        
         System.out.println("What is the exchange rate of euro to US dollars?");
        euroExchangeRate = in.nextDouble();
        
        System.out.println("Your budget is " + startingUsDollars + ". Spend wisely."); 

        // convertion for Mexican pesos
        // code goes below here
        System.out.println("Please input the number of Pesos you will spend as a decimal value");
        pesosSpent = in.nextDouble();
        dollarsSpentInMexico = pesosSpent / pesoExchangeRate;

        // convertion for Japanese yen
        // code goes below here
        System.out.println("Please input the number of yen you will spend as a decimal value");
        yenSpent = in.nextDouble();
        dollarsSpentInJapan = yenSpent / yenExchangeRate;

        // convertion for Euros
        // code goes below here
        System.out.println("Please input the number of euro you will spend as a decimal value");
        euroSpent = in.nextDouble();
        dollarsSpentInFrance = euroSpent / euroExchangeRate;
        
        // dollars left
        remainingUsDollars = startingUsDollars - (dollarsSpentInMexico + dollarsSpentInJapan + dollarsSpentInFrance);
        
        //print output to the screen
        // code goes below here
        System.out.println("Dollars spent in Mexico = " + dollarsSpentInMexico);
        
        System.out.println("Dollars spent in Japan = " + dollarsSpentInJapan);
        
        System.out.println("Dollars spent in France = " + dollarsSpentInFrance);
        
        System.out.println("Remaining dollars = " + remainingUsDollars);
        
        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 4;  						//cost per item of first souvenir
		int budget1 = 0;   						//budget for first item
		int totalItem1 = 0; 		//how many items can be purchased
		double fundsRemaining1 = 0.0;  //how much of the budget is left
		
		System.out.println(" The cost for souvenir 1 is $" + costItem1 + ". Input amount your willing to spend to the nearest dollar.");
		budget1 = in.nextInt();
		fundsRemaining1 = budget1 % costItem1;
		totalItem1 = budget1 / costItem1;
		
		
		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItem1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);

		//Calculations for Souvenir #2
		double costItem2 = 32.55;  						//cost per item of second souvenir
		int budget2 = 713;   							//budget for second item
		int totalItem2 = 0; 	//how many items can be purchased
		double fundsRemaining2 = 0.0;  	//how much of the budget is left
		
		System.out.println(" The cost for souvenir 2 is $" + costItem2 + ". Input amount your willing to spend to the nearest dollar.");
		budget2 = in.nextInt();
		
		fundsRemaining2 = budget2 % costItem2;
        totalItem2  = (int)(budget2 / costItem2);

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItem2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
