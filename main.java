public class main {
    public static void main(String[] arg){
        int a =11;
        int b =0;
        try{
            //if no exception try block excuted
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            //if there is exception then catch block is used
           System.out.println("We fail to divide reason:" + e);
            
        }
    }
}
