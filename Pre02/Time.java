import java.io.*;
import java.util.*;

public class Time{

  public static void main(String[] args)
  {
    double hour;
    double minute;
    double second;
    double secondsSinceMidnight;
    double secondsRemaining; 
    final double SECONDS_IN_A_DAY = 86400.0;
    final double SECONDS_IN_HOUR = 3600.0;
    final double SECONDS_IN_MINUTE = 60.0;
    double percentOfDayThatPassed;
  
    hour = 15.0;
    minute = 18.0;
    second = 22.0;
  
    
    /*the code below calculates and initializes the seconds since midnight */
    secondsSinceMidnight = (hour * SECONDS_IN_HOUR) + (minute *         SECONDS_IN_MINUTE) + second;
    
    /*the code below calculates and initializes the seconds left in the day
    */
    secondsRemaining = SECONDS_IN_A_DAY - secondsSinceMidnight;

    /*the code below calculates and intializes the percent of day that passed*/
    percentOfDayThatPassed = secondsSinceMidnight /                    SECONDS_IN_A_DAY;


    //the code below prints the seconds since midnight
    System.out.printf("%.0f seconds have elapsed since                  midnight.\n", secondsSinceMidnight);

    //the code below prints the seconds remaining in the day
    System.out.printf("There are %.0f seconds remaining in the         day.\n", secondsRemaining);

    //the code below prints the percentage of the day that has passed.
    System.out.printf("%.2f of the day has passed\n",                  percentOfDayThatPassed);

    /*The code below changes the value of h, m, s, to reflect current time*/
    hour = 15.0;
    minute = 56.0;
    second = 24.0;

    //initializes current time to seconds
    double currentTimeInSeconds = (hour * SECONDS_IN_HOUR) +           (minute * SECONDS_IN_MINUTE) + 24;

    /*Current time in seconds - secondsSinceMidnight = time that has elapsed since starting the exercise */
    System.out.println(currentTimeInSeconds -                          secondsSinceMidnight);    
  }
}

/* Make the program calculate and display the number of seconds since midnight.

Calculate and display the number of seconds remaining in the day.

Calculate and display the percentage of the day that has passed. You might run into problems when computing percentages with integers, so consider using floating-point.

Change the values of hour, minute, and second to reflect the current time. 

Then write code to compute the elapsed time since you started working on this exercise. */