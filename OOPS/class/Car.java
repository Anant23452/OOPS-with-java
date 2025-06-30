
class Car1 {
    //properties
    String color;
    int speed;
    String model;

    //behaviors
    //creating methods
    void Accelerate(int increment) {
        speed += increment;
    }
    void Break(int decrement) {
        speed -= decrement;
    }
}

public class Car {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.color = "Red";
        c1.speed = 40;
        c1.model = "BMW";
        c1.Accelerate(20);

        System.out.println("Car color: " + c1.color);
        System.out.println("Car speed: " + c1.speed);
        System.out.println("Car model: " + c1.model);
    }
}
