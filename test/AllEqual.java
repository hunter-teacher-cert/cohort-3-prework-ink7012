import java.io.*;
import java.util.*;

public class AllEqual {
  
  public static void main(String[] args) {
    int a = Integer.parseInt(args [0]);
    int b = Integer.parseInt(args [1]);
    int c = Integer.parseInt(args [2]);

    if(a == c && a == b) {
      System.out.println("Equal");
    } else {
      System.out.println("Not Equal");
    }
  }
  
}

/*
int x = Integer.parseInt(args [0]);
int y = Integer.parseInt(args [1]);

*/

