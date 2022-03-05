import java.io.*;
import java.util.*;


public class Loops 
{
//exercise 2
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
//exercise 3
  public static double power (double x, int n)
  {
    double answer = x;
    

    if (n == 0)
    {
      answer = 1;
    }
    else
    {
      while (n > 1)
        {
          answer = answer * x;            
          n = n - 1;
        }
    }
    return answer;
  }

//exercise 4
public static int factorial(int n)
{
  int answer = n;
  int times = n;
  
  if (n == 0 )
  {
    answer = 1;  
  }
  else
  {
    while (n > 1)
      {
        answer = answer * (n - 1);
        n = n - 1;
      }
  }
  return answer;
}


  
  
  public static void main(String[] args) 
  {       
    System.out.println(factorial(4));
  }
}

/*






*/