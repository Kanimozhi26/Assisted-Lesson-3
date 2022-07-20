package keywords_exceptions;

class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 
public class exception1
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("temp"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}
