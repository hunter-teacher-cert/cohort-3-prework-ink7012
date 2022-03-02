import java.util.*;
import java.io.*;

public class NumberTester {
  
  public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      int num;
    
    System.out.println("Type a number and I will tell you if it is negative");

    num = in.nextInt();

    if (num < 0) {
      System.out.println("The number " + num + " is negative!");
    }
    else {
      System.out.println("The number " + num + " is zero or positive!");
    }

    System.out.println("Goodbye for now!");
  }
}