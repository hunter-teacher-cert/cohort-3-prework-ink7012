import java.io.*;
import java.util.*;

public class Methods 
{

  //exercise 2
  public static boolean isDivisible(int n, int m) 
  {
    return n % m == 0;   
  }

  //exercise 3
  public static String isTriangle(int a, int b, int c) 
  {
    String answer;
    
    if (a < (b + c) && b < (a + c) && c < (a + b)) 
    {
      answer = "true";
    }
    else 
    {
      answer = "false";
    }
    return answer;
  }

  //exercise 8
  public static int ack(int m, int n) 
  {
    int answer;
  
    if (m == 0) 
    {
      answer = n + 1;  
    }
    else if(m > 0 && n == 0) 
    {
      answer = ack(m - 1, 1);
    }
    else 
    {
      answer = ack(n - 1, ack(m, n - 1));
    }

    return answer;
  }
  
  public static void main(String[] args) 
  {
    System.out.println(ack(1,0)); 
  }
}



/*
Create a folder named pre05 under the assignment repo. Write a program named Methods.java with methods that solve exercises 2, 3, and 8 from Chapter 6 in Think Java.

Exercise 2:
Write a method named isDivisible that takes two integers, n and m, and that returns true if n is divisible by m, and false otherwise.

Exercise 3:
If you are given three sticks, you may or may not be able to arrange them in a triangle. For example, if one of the sticks is 12 inches long and the other two are one inch long, you will not be able to get the short sticks to meet in the middle. For any three lengths, there is a simple test to see if it is possible to form a triangle:

If any of the three lengths is greater than the sum of the other two, you cannot form a triangle.

Write a method named isTriangle that takes three integers as arguments and returns either true or false, depending on whether you can or cannot form a triangle from sticks with the given lengths. The point of this exercise is to use conditional statements to write a value method.


Exercise 8:



*/