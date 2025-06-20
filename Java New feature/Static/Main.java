interface calculator{
   static int add(int a ,int b){
    return a+b;
   };
   static int sub(int a, int b){
    return a-b;}
    
}

public class Main {
    public static void main(String[] args){
        int sum = calculator.add(10, 20);
        int difference = calculator.sub(20, 10);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
