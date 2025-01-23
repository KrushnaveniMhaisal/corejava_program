/*Write java program to invoke current class method using this keyword */

class Demo {
    
    // Method to display a message
    void display() {
        System.out.println("Display method is called.");
    }

    // Method that invokes the display() method using 'this' keyword
    void invokeMethod() {
        System.out.println("Invoking the display method using 'this' keyword...");
        this.display();  // Using 'this' to call the display() method
    }
}

public class ThisKeyword{
    public static void main(String[] args) {
        Demo obj = new Demo();  // Creating an object of Demo class
        obj.invokeMethod();     // Calling invokeMethod to trigger display method
    }
}

/*Output

Invoking the display method using 'this' keyword...
Display method is called.
*/

