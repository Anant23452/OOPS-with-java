

public class Inheriten{
    public static void main(String[] args) {
        animal an= new animal();
        dog Dog = new dog();
        an.sayhello();
        Dog.sayhello();
    }

}
 class animal {
    void sayhello(){
        System.out.print("Animals are cute");
    }
}
 class dog extends animal {
    @Override
    void sayhello(){
        System.out.println("Dog is cute");

    }
}
