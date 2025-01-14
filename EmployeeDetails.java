/*Write a java program to take Employee id, name, address and salary from user and display on to screen.*/

import java.util.Scanner; // Importing Scanner class for user input

class EmployeeDetails	 { 
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in); 

        // Declare variables to store employee details
        int empId;
        String name, address;
        double salary;

        // Prompt the user to enter employee details
        System.out.println("Enter Employee ID:");
        empId = sc.nextInt(); // Read Employee ID

        sc.nextLine(); // Consume the leftover newline character

        System.out.println("Enter Employee Name:");
        name = sc.nextLine(); // Read Employee Name

        System.out.println("Enter Employee Address:");
        address = sc.nextLine(); // Read Employee Address

        System.out.println("Enter Employee Salary:");
        salary = sc.nextDouble(); // Read Employee Salary

        // Display the entered employee details
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: $" + salary);
    }
}

/*Output

Employee Details:
ID: 102
Name: Meghu
Address: 342, Sunil nagar, Solapur
Salary: $30000.0


Employee Details:
ID: 101
Name: Shashi
Address: 123, Kalavati nagar, Solapur
Salary: $50000.0
*/

