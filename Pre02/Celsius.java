import java.io.*;
import java.util.*;

public class Celsius{
  public static void main(String[] args){

Scanner in = new Scanner(System.in);

double Celsius;
double Fahrenheit;

//prompts user to input celsius 
System.out.println("What's the Celsius temperature you would like to convert?");

//initializes Celsius
Celsius = in.nextDouble();


//initializes Fahrenheit by converting from Celsius
Fahrenheit = Celsius * (9.0/5.0) + 32;

System.out.printf("%.1f C = %.1f F\n", Celsius, Fahrenheit);




  }
}





/*Exercise 2   Write a program that converts a temperature from Celsius to Fahrenheit. It should (1) prompt the user for input, (2) read a double value from the keyboard, (3) calculate the result, and (4) format the output to one decimal place. For example, it should display "24.0 C = 75.2 F".
Here is the formula. Be careful not to use integer division!

F = C × 	
9
5
 + 32 
*/