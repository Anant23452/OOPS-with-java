package ExceptionHandling.ExceptionFlow;

public class NOException {
  public static void main(String[] args){
      try{
        System.out.println("This is a normal flow of excution without any erross");
    }
    catch(Exception e){
        System.out.println("This block will not execute because there are no errors");
    }
    finally{
        System.out.println("This block will always execute, even if there are no errors");
    }
  }
}
