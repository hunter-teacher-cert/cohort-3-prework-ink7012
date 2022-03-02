import java.io.*;
import java.util.*;

public class Beer 
{
  public static void beerBottles(int b) 
  {
    if(b > 0) 
    {
      System.out.println(b + " bottles of beer on the wall,");
      System.out.println(b + " bottles of beer,");
      System.out.println("ya' take one down, ya' pass it around,");
      System.out.println(b - 1 + " bottles of beer on the wall.");
      System.out.println();
      beerBottles(b - 1);
    }
    //last verse
    else 
    {
      System.out.println("No bottles of beer on the wall,\nno bottles of beer,\nya’ can’t take one down, ya’ can’t pass it around,\n’cause there are no more bottles of beer on the wall!");
    }   
  }

  
  public static void main(String[] args) 
  {
    beerBottles(99);
  }
}




/*
99 bottles of beer on the wall,
99 bottles of beer,
ya’ take one down, ya’ pass it around,
98 bottles of beer on the wall.




No bottles of beer on the wall,
no bottles of beer,
ya’ can’t take one down, ya’ can’t pass it around,
’cause there are no more bottles of beer on the wall!



*/