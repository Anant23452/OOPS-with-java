package Exception Handling.Exception flow;

public class TryCatch {
    public static void main(String[] args){
        try{
            //risky code that may throw an exception
        }
        catch(Exception e){
            //handle the exception
            //this block will execute if an exception occurs in the try block
        }
        finally{
            //this block will always execute, regardless of whether an exception occurred or not
            //useful for cleanup code, like closing resources
        }
       
    }
}
