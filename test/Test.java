import java.io.*;
import java.util.*;

public class Test
{
  public static void main(String[] args)
  {
    int[] array = {1, 2, 3, 4};
    int[] reverse = new int[4];

    int reverseCounter = array.length -1;
    
    for (int i = 0; i < array.length; i ++)
      {
        reverse[reverseCounter] = array[i];
        System.out.println(array[i]);
        System.out.println(reverseCounter);
        reverseCounter --;
        System.out.println(reverseCounter);
        
      }

    System.out.println(Arrays.toString(reverse));

  }
}

