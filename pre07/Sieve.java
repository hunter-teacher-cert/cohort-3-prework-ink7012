import java.io.*;
import java.util.*;

public class Sieve
{

  public static boolean[] sieve(int n)
  {

    int limit = n - 1;
    boolean array[] = new boolean[n];
    
        for (int i = 2; i <= limit; i++)
            array[i] = true;
      //set all numbers above 2 to true
    
 
        for (int i = 2; i <= limit; i++)
        {
          // for loop to traverse the array of numbers
          if (array[i] == true)
          {
            // loop sets all multiples of a true to false
            for (int j = i + i; j <= limit; j += i)
            
            array[j] = false;
          }
        }

      return array;
    }

  public static void main(String[] args)
  {
    boolean[] array;
    
    array = sieve(100);
    
    for (int i = 0; i < array.length; i++)
    {
      System.out.println(i + ", " + array[i]); 
    }
    
  }
}



