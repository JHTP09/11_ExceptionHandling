package examples.section06;

/**
 * @author Mohamed
 */
public class UsingExceptions 
{
    public static void main( String[] args )
    {
        try
        {
            throwException();
        }
        catch( Exception e )
        {
            System.err.println( "Exception handled in main" );
        }
        
        doesNotThrowException();
    }
    
    public static void throwException() throws Exception
    {
        try
        {
            System.out.println( "Method throwException" );
            throw new Exception();
        }
        catch( Exception exception )
        {
            System.err.println( "Exception handled in method throwException" );
            throw exception;    // rethrow exception
            
            // Any code here results in compilation error
        }
        finally
        {
            System.err.println( "Finally executed in method throwException" );
        }
        
        // Any code here results in compilation error
    }
    
    public static void doesNotThrowException()
    {
        try
        {
            System.out.println( "Method doesNotThrowException" );
        }
        catch( Exception exception )    // Will not execute
        {
            System.err.println( exception );
        }
        finally
        {
            System.err.println( "Finally executed in method doesNotThrowException" );
        }
        
        System.out.println( "End of method doesNotThrowException" );
    }
}
