// DebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department
import java.util.Scanner;
public class DebugFive2
{
   public static void main(String args[])
   {
      int num;
      int num2;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number ");
      num = input.nextInt();
      System.out.print("Enter another number ");
      num2 = input.nextInt();
      if((num % num2 == 0) && (num2 / num) == 0)
      {
         System.out.println("One of these numbers is");
         System.out.println("   evenly divisible into the other");
      }
      else
      {   
         System.out.println("Neither of these numbers is");
         System.out.println("  evenly divisible into the other");
      }
   }
}

// Debug list:
// - added () to input.nextInt()
// - fixed missing () for second input.nextInt()



