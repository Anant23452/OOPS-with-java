// package Exception Handling.Exception flow.Trycatch;/

public class Test {
    public static void main(String[] args){
        level1();
    }
    public static void level3(){
        int[] array = new int[5];
        array[5] = 10;
    }
    public static void level2(){
        level3();
    }
    public static void level1(){
        level2();
    }
}
