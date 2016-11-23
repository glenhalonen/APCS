

/**
 *  CalculationsV5 
 * 
 * @author Glen Halonen 
 * @version 9/15/16
 */
public class Calculations_v3
{
    public static void main(String[ ] args)
    {
       int iNum1 = 25;
       int iNum2 = 9;
       int iNum3 = 16;
       int iNum4 = 5;
       
       double dNum1 = 43.21;
       double dNum2 = 3.14;
       double dNum3 = 5.0;
       
        // Addition
        System.out.println("Addition");
        System.out.println( iNum1 + " plus " + iNum2 + " = " );
        System.out.println (iNum1 + iNum2);
        
        System.out.println(dNum1 + " plus " + dNum2 + " plus " + dNum3  + " = ");
        System.out.println( 43.21 + 3.14 + 5.0 );
        
        //System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " minus " + iNum2 + " minus " + iNum1 + " = ");
        System.out.println(iNum3 - iNum2 - iNum1);
        
        System.out.println(dNum2 + " minus " + dNum3 + " = ");
        System.out.println( 3.14 - 5.0 );
        //System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " times " + iNum2 + " = ");
        System.out.println(iNum1 * iNum2);
        
        System.out.println(dNum2 + " times " + iNum4 + " times " + iNum4 + " = ");
        System.out.println(dNum2 * iNum4 * iNum4 );
        //System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " divided by " + iNum1 + " = ");
        System.out.println(iNum2 / iNum1);
        
        System.out.println(dNum1 + " divided by " + iNum4 + " = ");
        System.out.println( 43.21 / iNum4 );
        //System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " mod "+ iNum2 + " = ");
        System.out.println(iNum3 % iNum2);
       
        System.out.println(iNum4 + " mod " + dNum2 + " = ");
        System.out.println(iNum4 % dNum2);
        
        //System.out.println();
        int iNum5 = 15;
        int iNum6 = -2;
        int iNum7 = 10;
        int iNum8 = 234;
        int iNum9 = 6;
        int iNum10 = 12;
        int iNum11 = 3;
        int iNum12 = 24;
        int iNum13 = 480;
        int iNum14 = 11;
        int iNum15 = 17;
        int iNum16 = 2;
        int iNum17 = 200;
        int iNum18 = 20;
        int iNum19 = 8;
        // 2.02 Lab Equations
        // 15 divided by 2.5 times -2 plus 10 / 5
        System.out.println(iNum5 + " divide by " + " 2.5 times " + iNum6 +" + "+ iNum7 + " divided by " + iNum4 + " = ");
        System.out.println((iNum5 / 2.5) * iNum6 + (iNum7 / iNum4));
        // 234 minus (234 divided by 6 modulus 12) + 3
        System.out.println(iNum8 + " minus " + iNum8 + " divided by " + iNum9 + " mod " + iNum10 + " + " + iNum11 + " = ");
        System.out.println(iNum8 - (iNum8 / ( iNum9 % iNum10)) + iNum11);
        // (46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3)
        System.out.println( "46.2 divided by "+ iNum14 +" minus "+ iNum11 +" plus "+ iNum12 +" mod ("+ iNum15 +" minus "+ iNum16 +" times "+ iNum11 +")" + " = ");
        System.out.println( (46.2 / iNum14) - iNum11 + (iNum12 % (iNum15 - iNum16 * iNum11)));
        // 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8
        System.out.println(iNum13 + " divided by " + iNum7 + " divided by " + iNum10 + " plus  " + iNum17 + " times .5 minus " + iNum18 +" mod "+ iNum19 + " = "); 
        System.out.println((iNum13 / iNum7 / iNum10) + (iNum17 * .5) - (iNum18 % iNum19));
        // 2.03 Additional int Equations
        
        // 20 mod 3 divided by 3.14 times 5 mod 6
        System.out.println( iNum18 + " mod " + iNum11 + " divided by 3.14 times " + iNum4 + " mod " + iNum9 + " = ");
        System.out.println(((iNum18 % iNum11) / 3.14) * (iNum4 % iNum11));
        // 20 plus 3 minus 5 times 2
        System.out.println(iNum18 + " plus " + iNum11 + " minus " + iNum4 + " times " + iNum16 + " = ");
        System.out.println(iNum18 + iNum11 - (iNum4 * iNum16));
        //2.04 Additional double Equations
        double dNum4 = 19.0;
        double dNum5 = 3.0;
        double dNum6 = -0.75;
        
        //19 mod 3 minus 3 divided by -.75
        System.out.println( dNum4 + " mod " + dNum5 + " minus " + dNum5 + " divided by " + dNum6 + " = ");
        System.out.println( (dNum4 % dNum5) - (dNum5 / dNum6));
        
        //-0.75 mod 3 times 19 plus -0.75
        System.out.println(dNum6 + " mod " + dNum5 + " times " + dNum4 + " plus " + dNum6 + " = ");
        System.out.println(dNum6 % dNum5 * dNum4 + dNum6);
        
               
    } // end of main method
    }
