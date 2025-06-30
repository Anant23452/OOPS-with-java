

public class Test {
    public static void main(String[] args) {
        int[] b = {1, 2, 3, 4, 5};
        sumOfarray(b);
        
    }
    public static void sumOfarray(int[] arr){
        int sum =0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println(sum);
    }
}
