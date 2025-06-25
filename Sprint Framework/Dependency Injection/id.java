class Engine{
    void start(){
        System.out.println("Engine started");
    }

}
class Car{
    // Engine engine = new Engine();//Tight coupling
    Engine engine;//Loose coupling

    // Constructor Injection
    Car(Engine engine){
        this.engine = engine;
    }
    void drive(){
        engine.start();
        System.out.println("Car is driving");
    }
}