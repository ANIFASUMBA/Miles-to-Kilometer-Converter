import java.util.Scanner;
public class MilesToKilometers {public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in); 
  // Prompt the user to enter the distance in miles
 System.out.print("Enter distance in miles: ")double miles = scanner.nextDouble();
 //convert miles to kilometers
 double kilometers = miles * 1.6 
  // Display the result
 System.out.println(miles + " miles is equal to " + kilometers + " kilometers");
 }
 }
