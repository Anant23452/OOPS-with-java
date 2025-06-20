public interface MyInterface  {
void show(); // abstract method
    
}
interface DefaultMethod {
    default void start() { // default method
        System.out.println("This is a default vehicle is starting ");
    }
}
class car implements DefaultMethod{
 //No need to implement start method
    // because it is already implemented in DefaultMethod interface

}
