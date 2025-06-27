// package Exception Handling.Exception flow.Trycatch;

public class Trycatch {
    public static void main(String[] args){
        int[] numbers ={12, 34, 56, 78, 90};
        int[] denominators = {2, 0, 3, 4, 5};
        for(int i =0;i<numbers.length;i++){
            System.out.println(divide(numbers[i], denominators[i]));
        }
        System.out.println("Good Job ");
    }
    public static int divide (int a, int b){
        try{
            return a/b;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic esceptin :(");
            return -1;
        }
    }
}
