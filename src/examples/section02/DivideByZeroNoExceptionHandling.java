package examples.section02;

import java.util.Scanner;

/**
 * @author Mohamed
 */
public class DivideByZeroNoExceptionHandling 
{
    public static int quotient( int numerator, int denominator )
    {
        return numerator / denominator;
    }
    
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        
        System.out.print( "Please enter an integer numerator: " );
        int numerator = input.nextInt();    // Assume user inputs a valid integer
        System.out.print( "Please enter an integer denominator: " );
        int denominator = input.nextInt();  // Assuem user inputs a valid integer
        
        int result = quotient( numerator, denominator );
        System.out.printf( "\nResult: %d / %d = %d\n",
                numerator, denominator, result );
    }
}