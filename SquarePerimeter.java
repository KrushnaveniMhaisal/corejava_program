/*Write a program to find the perimeter of the square.*/


import java.util.Scanner; // Importing the Scanner class for user input

class SquarePerimeter { // Defining the SquarePerimeter class
    public static void main(String[] args) { // Main method where program execution begins
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input

        System.out.println("Enter the length of one side of the square:"); // Prompt the user to enter side length
        double side = sc.nextDouble(); // Reading the side length as a double

        // Calculate the perimeter using the formula
        double perimeter = 4 * side;

        // Display the result
        System.out.println("The perimeter of the square is: " + perimeter);
    }
}

/*Output  

Enter the length of one side of the square: 6
The perimeter of the square is: 24.0

Enter the length of one side of the square: 8.6
The perimeter of the square is: 34.4
*/


