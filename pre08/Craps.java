import java.io.*;
import java.util.*;

public class Craps
{
  public static void main(String[] args)
  {
    System.out.println(roll(5));
  }

  
  public static int roll(int n)
  {
  //returns a random number between 1 and n, inclusive
    Random random = new Random();
    return random.nextInt(n);
  }

  public static int shoot(int numOfDice, int maxVal)
  {
    //return array?
    int result = roll(3);

    return result;
  }

  public static String round()
  {
   
    return "test";
    
  }

  
}


//method1: roll(int n)
//method2: shoot
//method2: round
/* 
There should be at least three static methods in addition to main. 

One named roll which accepts an integer parameter and returns a random number between 1 and that number, inclusive. 

There should also be one named shoot which accepts two parameters - a number of dice and the maximum value for those dice and returns the result of rolling those dice.

The third method should be named round. It should accept no parameters and it should return something to indicate if the shooter of the round wins or loses.

  */


