import java.io.*;
import java.util.*;

public class Test2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int numberOfNames;
    
    System.out.println("How many names do you want to enter?"); 

    numberOfNames = in.nextInt();
    String[] nameOfNames = new String[numberOfNames];
    
    System.out.println("Ok. Now tell me each name one by one. Remember to use the convention of last name, first name");
    
    for (int i = 0; i < numberOfNames; i++)
    {
      System.out.println("Name: "  );
      nameOfNames[i] = in.nextLine();
    }
    
  }
}