/*Write a Java Program  to pass  this keyword as argument in the constructor call.*/

// Class to demonstrate passing 'this' as an argument in constructor
class ThisArgument {
    // Instance variable to store reference of This_Constructorargument
    This_ConstructorArgument var;

    // Constructor accepting This_Constructorargument object as a parameter
    ThisArgumentThis_ConstructorArgument var) {
        this.var = var;  // Assigning the passed object to the instance variable
    }

    // Method to display the value of count from This_Constructorargument class
    void show() {
        System.out.println("Count variable value: " + var.c);
    }
}

// Main class demonstrating the use of 'this' keyword in constructor call
public class This_ConstructorArgument {

    int c = 1;  // Instance variable 'c' 

    // Constructor of This_Constructorargument
    This() {
        // Passing 'this' keyword to ThisArgument constructor
        ThisArgument obj = new ThisArgument(this);
        obj.show();  // Calling show() method to print the value of 'c'
    }

    public static void main(String[] args) {

        // Creating an instance of This_Constructorargument, which triggers constructor execution
        This_ConstructorArgument obj = new This_ConstructorArgument ();
    }
}


/*Output

Count variable value:1
*/