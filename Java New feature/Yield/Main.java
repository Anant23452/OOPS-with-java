import java.util.Scanner;
public class Main{
    public static void main(String[] args)
{
   //Talking input number from user
  Scanner sc =new Scanner(System.in);
    System.out.print("Enter a number (1-7) to get the day of the week: ");
    int number = sc.nextInt();

    String dayName= switch (number) {
        case 1 ->"monday";
        case 2-> "tuesday";
        case 3 -> "wednesday";  
        case 4 -> "thursday";
        case 5 -> "friday"; 
        case 6 -> "saturday";
        case 7 -> "sunday";
        default -> {yield "Invalid day";} // Using yield to return a value from the block
    };
    System.out.println("Day of the week: " + dayName);
}
}