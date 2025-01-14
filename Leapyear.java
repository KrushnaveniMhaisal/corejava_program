/* Write A Program to check leap year using if else. How to check whether a given year is leap
 year or not*/

import java.util.Scanner; // Importing the Scanner class for user input

class Leapyear {
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for taking user input
        int year; // Declaring an integer variable to store the year input by the user

        System.out.println("Enter year:"); // Prompting the user to enter a year
        year = sc.nextInt(); // Reading the year entered by the user and storing it in the variable 'year'

        // Checking if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { 
            // A year is a leap year if it is divisible by 4 and not divisible by 100,
            // OR it is divisible by 400
            System.out.println(year + " is a Leap year");
        } else { 
            // If the above conditions are not met, it is not a leap year
            System.out.println(year + " is not a Leap year");
        }
    }
}


/* Output

Enter year:2003
2003 is not Leap year

Enter year:2000
2000 is Leap year
*/
