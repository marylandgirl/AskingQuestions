import java.util.Scanner;
/* This is a modification to a program from Java Bootcamp
*  The program prompts user to input two temperature values and 
*  calculates the average. The the average value is displayed
*  on the screen
*/
public class AskingQuestions {
   public static void main(String[] args) {

      Scanner keyboard = new Scanner(System.in);

      double num1, num2;

      //Get first temperature value
      System.out.print("First Temperature? ");
      num1 = keyboard.nextDouble();
      keyboard.nextLine();

      //Get second temperature value
      System.out.print("Second Temperature? ");
      num2 = keyboard.nextDouble();
      keyboard.nextLine();

      //Calculate average value and display on console
      System.out.println("The average value is : " + (num1 + num2)/2);
   }
}
