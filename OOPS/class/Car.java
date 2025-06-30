
class car1{
    //properties
    String color;
    int speed;
    String model;

    //behaviors
    //creating methods
    void Accelerate(int increment){
        System.out.println("Accelerating");
        speed += increment;
    }
    void Break(int decrement){
        System.out.println("Breaking");
        speed -= decrement;
    }
}
public class Car{
   public static void main(String[] args){
    car1 c1 = new car1();
    c1.color = "Red";
    c1.speed = 40;
    c1.model = "BMW";
    c1.Accelerate(20);

    System.out.println("Car color: " + c1.speed);

   }
}
