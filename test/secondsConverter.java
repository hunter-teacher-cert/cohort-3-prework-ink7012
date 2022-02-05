import java.io.*;
import java.util.*;

public class secondsConverter{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int userInput;
    int hours;
    int minutes;
    int seconds;
    
    System.out.println("How many seconds would you like to convert?");

    userInput = in.nextInt();

    hours = userInput / 3600;


    System.out.printf("%d seconds = %d hours", userInput, hours);





  }
}