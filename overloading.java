class calculator{
    // add a number
    int add (int a, int b){
        return a +b;
    }
    //add  3 numbers
    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class overloading {
    public static void main(String[] args){
        calculator calc = new calculator();
        System.out.println("sum of 2 numbers:" + calc.add(3, 5));
    }
}