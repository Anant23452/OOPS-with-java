public class Error{
    public static void main(String[] args){
        recursive();//infinite recursion
    }
    public static void recursive(){
        recursive(); // This will cause a StackOverflowError due to infinite recursion
    }
}