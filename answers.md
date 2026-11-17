1.
The currentLoadKg is private and does not allow the modifier to be accessed directly. This is a form of security and encapsulation, where other classes could change their object's current weight by directly accessing it and changing it. Instead any change is done through methods, which check if the current load does not exceed the maximum. Hence it enforces encapsulation and that all load changes must go through established methods and their checks.

The registration is protected, meaning it allows classes that inherit the Vehicle class to access the registration directly. The registration serves as the identification of the object (vehicle) and does not require change or validation logic. Thus the 'protected' access modifier allows all child objects to easily use or reference their 'identification' while still hiding the registration variable from unrelated classes.

2.
Method overriding: it refers to a child class providing a new implementation for a method that is already defined in the parent class. An example from the code would be child classes overriding the 'calculateCost()' method, which is an abstract method in the parent class.

Method overloading: it refers to methods sharing the same name but having different parameters inside the same class. An example from the code: inside the Van class, there are two constructors: one for when we want to define the registration and whether the van is refrigerated "public Van(String registration, boolean refrigerated)", another constructor just defining the registration "public Van(String registration)".

3.
The output: 203.0

'calculateCost' method calls the method inside the abstract Vehicle class. That method calls the method with the same name ('calculateCost') located in the Truck class. That method has a formula "1.20 * distanceKm + 25 * axles". The method uses distanceKm = 100, axles = 3 and outputs 195.0. Then the output is carried back to the Vehicle class and is used there. In the Vehicle class there is additional logic, which adds 2.00 for every stop made (2.00 * stops). The number for stops is 4 (stops = 4), so the method adds additional 8.00, which gives the result of 203.0

4.
It doesn't compile because 'a' is declared as Vehicle, the compiler only checks what type does 'a' have. The compiler sees that 'a' is of type Vehicle and sees that the vehicle does not have a such method, hence throws an error.

5. 
The Vehicle class is an abstract class because it serves as the template for child classes. Everything the Vehicle class has, a child class does so too.

The reason for Vehicle class having a constructor is to initialize inherited instance variables, eliminating duplicate intialization logic. Every class has to initialize the variables inherited and constructor allows just that.

6.
Vehicle-Logbook is composition, because the logbook is created inside the Vehicle class. Thus, every child has its own logbook, which allows for every instance to have a logbook.

Depot-Vehicle is aggregation, where the Depot and the Vehicle class can exist without each other, but Depot class needs Vehicles for its logic.

the line 'north = null;' deletes the reference to the instance, meaning the depot is deleted, but the vehicle still exists.

7.
See cargobike.png

8.
Drone class being a child of the ElectricScooter class is a poor design choice. While both the scooter and the drone have limited range, the maximum load is hardcoded on the ElectricScooter class by passing 25 into the super(), therefore workaround would be needed to show the correct load. Additionally, a drone is not a type of scooter, therefore it may accidentally cause confusion for other developers.

The drone would benefit from inhereting the Vehicle class, just like any other child.
