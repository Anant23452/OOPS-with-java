

public class Test {
    public static void main(String[] args) {
        int[] b = {1, 2, 3, 4, 5};
        sumOfarray(b);

        int add = sum(4,5);
        System.out.println(add);

        int add1 = sum(4,5,9);
        System.out.println(add1);
        
    }
    public static void sumOfarray(int[] arr){
        int sum =0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println(sum);
    }

    // Method overloading 
    private static int sum(int a, int b){
        return a + b;
    }
    private static int sum(float a, float b){
        return a + b;
    }
    private static int sum (int a, int b,int c) {
        return a+b+c;
    }
}
