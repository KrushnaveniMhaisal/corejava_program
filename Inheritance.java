/*Create a parent class called "Vehicle" with attributes such as brand,model, year, and a method called
 "drive". Create a child class called "Car" that inherits from Vehicle and has an additional attribute called 
"color" and a method called "honk". Create an object of the Car class and call both the "drive" and "honk"
 methods. */

// Parent class Vehicle
class Vehicle {
    // Attributes of the Vehicle class
    String brand;
    String model;
    int year;

    // Method to represent driving action
    public void drive() {
        System.out.println("The " + brand + " " + model + " is now driving.");
    }
}

// Child class Car that inherits from Vehicle
class Car extends Vehicle {
    // Attribute to the Car class
    String color;

    public void honk() {
        System.out.println("The " + color + " " + brand + " " + model + " honks its horn!");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car();

        // Assigning values to the attributes of the Car object
        myCar.brand = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2022;
        myCar.color = "Red";

        // Calling the drive method from the Vehicle class
        myCar.drive();

        // Calling the honk method from the Car class
        myCar.honk();
    }
}

/*Output

The Toyota Corolla is now driving.
The Red Toyota Corolla honks its horn!

*/