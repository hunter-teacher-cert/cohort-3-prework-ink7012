import java.io.*;
import java.util.*;

// Exercises 1, 4, 5

public class Array
{
//exercise 1.1


  
 public static String powArray(double[] a, double arrayExponent)
 {
  
   for (int i = 0; i < a.length; i++) 
   {
    a[i] = Math.pow(a[i], arrayExponent); 
   }
   return Arrays.toString(a);
 }


//exercise 1.2 need to create random numbers based on counterNumbers

 public static void histogram(int counterNumber)
 {
    Random random = new Random();
    int[] counter = new int[counterNumber];
    int[] grades = new int[counterNumber];
    
    //initializes the array  
    for (int i = 0; i < grades.length; i++)
    {
      grades[i] = random.nextInt(counterNumber);
    }

    System.out.println(Arrays.toString(grades));

    //set up the histogram count that iterates 0 to gradesjava.length 
      for (int i = 0; i < grades.length; i ++)
      {
        int index = grades[i];
        counter[index] ++;
      }


   for (int i = 0; i < counter.length; i ++)
   {
      System.out.println(i + ", " + counter[i]); 
   } 
 }

  

  public static void main(String[] args)
  {
    //calls 1.1
    /* double[] base = {1, 2, 3, 4};
    System.out.println(powArray(base, 2)); */

    histogram(10);
  }
}



