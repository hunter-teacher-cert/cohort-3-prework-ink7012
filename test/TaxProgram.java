import java.io.*;
import java.util.*;


public class TaxProgram{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final double TAX_RATE = 0.0825;
    double price;
    double taxAmount;
    double totalPrice;

    System.out.println("What is the pre-tax total of your purchase?");

    price = in.nextDouble();

    

    if (price < 100.00) 
    {
      taxAmount = 0;
    } 
    else 
    {
      taxAmount = TAX_RATE * price;
    }

    totalPrice = taxAmount + price;

    System.out.printf ("The tax on your purchase is %.2f. The total cost is %.2f \n", taxAmount, totalPrice);
    
  }
}


/* Write a program that asks for a price, then calculates and prints the tax, then prints the total cost. */