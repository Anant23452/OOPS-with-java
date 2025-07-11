public class class1{

   
public static void main(String[] args){
    // class1 obj = new class1();
    // car c = obj.new car(); // creating an object of the inner class

    car c = new car();
    c.color = "Red"; // setting the color property
  
  
}
}

 class car{
        //properties
        String color;
        //behaviors
        void speed(){
            System.out.println("Speed is 60km/h");
        }
        int tue(int increment) {
            return increment + 60; // returns the new speed after increment
        }
    }
