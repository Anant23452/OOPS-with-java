package OOPS.Polymorphism;

public class test {
    public static void main(String[] args) {
        animal myAnimal = new animal();
        myAnimal.sayhello();

        animal mydog = new dog();//upcasting
        animal mycat = new cat();//upcasting
        mydog.sayhello();
        mycat.sayhello();

        //we only implement those thing which both animal and dog have if dog have animal des't have it show error
        // mydog.name(); gave error  because not it animal section
        dog d = new dog();
        d.name();
    }
    
}
