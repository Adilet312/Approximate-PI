/*
+-----------------------------------------------+
Course: CSC 142 W19 2313 - COMPUTER PROGRAMMING;
Student: Adilet Momunaliev;
Home Work: 01;
+------------------------------------------------+
*/
/*
 * -------------------------------------------------------------------------------------------------------------------------------*
 Programm calculates approximation of the "Pi" by using Madhava of Sangamagrama's method.
 The programm consists of one method with one parameter.In addition,there are two "for" loop ,
 which are one of them is main and second one is in approximate_Pi function. 
 Aproximation_Pi method's parameter recives even values from 2 to 30 from the call method, which is located in the main method and
 calculates each iteration  and returns back to main method  to output each  caclulation of the pi line by line.
 *---------------------------------------------------------------------------------------------------------------------------------*
 */


public class Aproximate_pi
{
    public static void main (String[] args)
        {
            System.out.println("Math.PI = "+Math.PI);
            System.out.println(" ");
            
            for (int p = 1; p <= 15; p++)
            
            {   
                int ttimes = 2 * p; //Each iteration p multiplies by 2 ,assigns to ttimes veriable, and sends to function call as a value for the parameter.  
                
                System.out.println("aproximate ( "  + ttimes + " terms ) = " + aproximate_Pi(ttimes)); // Aproximate_Pi's argument sends value and also printed as a result.
                
            }
            
        
        
        }
    
    public static double aproximate_Pi( int n) //The Method or Function "aproximate_Pi(int n)" with one parameter approximates pi using Madhava of Sangamagrama's method.
    
        {
            
            double k = 1.0;
            
            double sums = 1.0;
            
            for (int i = 1; i < n; i++)
            
            {                           // This is the main block code, which summs up values, which is half calculation of the pi.Summation(from 0 to n) [(-1)^n] / [((3)^n) * (2*n+1)];
                k = k / ( -3.0 );
                
                sums = sums + k / (2.0 * i + 1);
            }
            
            double ap_pi = Math.sqrt( 12.0 ) * sums; //This is final line to calculate approximation of the pi , which multiplies sums by Sqrt(12) such as:
                                                  // Math.sgrt(12) * Summation(from 0 to n) [(-1)^n] / [((3)^n) * (2*n+1)].
            return ap_pi;                      // Returns floating-point value (approximation of the pi).
        } 
}
