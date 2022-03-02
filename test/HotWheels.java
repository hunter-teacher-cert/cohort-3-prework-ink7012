import java.io.*;
import java.util.*;

public class HotWheels
{
  public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      int credit, cash;

      System.out.println("How much credit do you have? ");
      credit = in.nextInt();

      System.out.println("How much cash do you have? ");
      cash = in.nextInt();

      if (credit >= 25000 || cash >= 25000) 
        {
          System.out.println("You can afford the miata!");
        }else 
          {
            System.out.println("Reconsider taking the bus...");
          }
    }
}