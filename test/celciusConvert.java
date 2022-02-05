import java.io.*;
import java.util.*;

public class celciusConvert{

public static void main(String[] args){
double celcius;
double farenheit;
Scanner in = new Scanner(System.in);

System.out.print("What's the celcius?");
celcius = in.nextDouble();

farenheit = celcius * (9.0 / 5.0) + 32.0;

System.out.printf("%.1f C = %.1f F \n", celcius, farenheit);


  }
}