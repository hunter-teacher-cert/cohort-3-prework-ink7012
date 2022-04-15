import java.io.*;
import java.util.*;

public class Test
{

  public static int indexOfMax(int[] array)
  {
    int maxIndex = 0;
    
    for (int i = 1; i < array.length; i++)
    {
        if (array[i] > array[maxIndex])
        {
          maxIndex = i; 
        }
          
    }
    return maxIndex;
  }

  public static void main(String[] args)
  {
    int[] test = {3,2,6,4,5};
    System.out.println(indexOfMax(test));    
  }    
} 

//This method would not be possible with an enhanced for loop because there is an ability to use search operations in enhanced for loops.