//print backwards

import java.io.*;
import java.util.*;

public class Test
{
  public static void main(String[] args)
  {
  
  String[] firstAndLast = {"Philip, Chu", "Joana, Chu", "Ken, Chu", "Garvin, Mui", "Connie, Mui", "Kin, Chu", "Yim, Chu"};  
    
  int length = firstAndLast.length;
    
    
    
for (int i = 0; i < firstAndLast.length; i++)
    {
      int commaPosition = firstAndLast[i].indexOf(',');
      System.out.println(firstAndLast[i].substring(0, commaPosition));
      
    }

    String phil = "Phil Chu";
    String philip = "phil Chu";

    System.out.println(phil.toUpperCase().equals(philip.toUpperCase()));
    
  }
}

//.toUpperCase()
//.toLowerCase()
//.replace(original, replacement)
// .length()
//.charAt()
//.indexOf('i')
//.indexOf('i', 2)   < Starts looking at index 2 of the string
//.substring(n)
//.substring(n, o)   <-- == mid
// if (name1.equals(name2)) <-- compares
//name1.compareto(name2)  <-- will tell you how many letters is off between the first discrepancy of the first and second strings.

//stringName.format("%02d:%02d %s", hour, minute, ampn) << like print f but for return


//Integer.parseInt(stringName) <-- converts string to int

//Integer.toString(intName) < converts int to String