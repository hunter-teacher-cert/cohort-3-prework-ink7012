import java.io.*;
import java.util.*;


public class Guess
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    Random random = new Random();

    int answer = random.nextInt(100) + 1;
    int guess;
    int difference;
  
    System.out.print("I'm thinking of a number between 1 and 100       (including both). Can you guess what it is?\nType a number:         ");

    guess = in.nextInt();
    difference = Math.abs(guess - answer);

    System.out.println("Your guess is: " + guess);
    System.out.println("The number I was thinking of is: " +            answer + "\nYou were off by: " + difference);
  }
}



/*
I'm thinking of a number between 1 and 100
(including both). Can you guess what it is?
Type a number: 45
Your guess is: 45
The number I was thinking of is: 14
You were off by: 31
*/