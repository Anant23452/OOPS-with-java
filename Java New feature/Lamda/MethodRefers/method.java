
import java.util.Arrays;
import java.util.List;



public class method {
   static  void  say(String s)
    {
        System.out.println(s);
    }

public static void main(String[] args) {
    List<String> students = Arrays.asList("anan","bod","clccc");
    students.forEach(method::say);
    // students.forEach((p)->System.out.println(p));
    everthing ev = new everthing();
    students.forEach(ev::say2);
}
}
 class everthing{
    void say2( String s){
        System.out.println("Reference without making static folder");
        System.out.println(s);
    }
 }
