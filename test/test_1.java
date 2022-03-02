import java.io.*;
import java.util.*;

public class test_1{


  public static void countDown(int n) {
    if (n > 0) {
      countDown(n - 1);
      System.out.println(n);
      
    }
    


  }

  public static void main(String[] args){
      countDown(4);
    }



  }


