import java.io.*;
import java.util.*;


public class Loops 
{

  public static double squareRoot(double a) 
  {
    double currentGuess;
    double nextGuess = a/2;
    double answer;

    
    do 
    {
      currentGuess = nextGuess;  
      nextGuess = (currentGuess + a/currentGuess) / 2;
      
    } while ((currentGuess - nextGuess) > .0001);
      
    return nextGuess;
    
  }

  public static void main(String[] args) 
  {       
    System.out.println(squareRoot(25));
  }
}

/* Create a directory named pre06 under your assignments repo. Write a program named Loops.java which has solutions to excercises 2,3, and4from chapter 7 of Think Java. 

Exercise 2  
Let’s say you are given a number, a, and you want to find its square root. One way to do that is to start with a rough guess about the answer, x0, and then improve the guess using this formula:

x1 =(x0 + a/x0) / 2 
For example, if we want to find the square root of 9, and we start with x0 = 6, then x1 = (6 + 9/6) / 2 = 3.75, which is closer. We can repeat the procedure, using x1 to calculate x2, and so on. In this case, x2 = 3.075 and x3 = 3.00091. So it converges quickly on the correct answer.

Write a method called squareRoot that takes a double and returns an approximation of the square root of the parameter, using this technique. You should not use Math.sqrt.

As your initial guess, you should use a/2. Your method should iterate until it gets two consecutive estimates that differ by less than 0.0001. You can use Math.abs to calculate the absolute value of the difference.






*/