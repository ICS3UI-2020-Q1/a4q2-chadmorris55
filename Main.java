import java.util.Scanner;
/**
 * keeps asking user for number until they iput a negative number or 0
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    int number;
    // asks user for a number
    do {
      System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
      number = input.nextInt();
      } while (number > 0);
      System.out.println("All done!");
  }
}
