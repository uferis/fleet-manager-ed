package org.example;
public class Main{
    public static void main(String[] args) {
        Driver ana = new Driver("Ana", "B");
        Driver tomas = new Driver("Tomas", "C");
        Van van = new Van("VAN-101");
        Truck truck = new Truck("TRK-201", 2);
        ElectricScooter scooter = new ElectricScooter("SCO-301", 30);
        System.out.println(van.assignDriver(ana));
        System.out.println(truck.assignDriver(ana));
        System.out.println(truck.assignDriver(tomas));
        System.out.println(truck.getDriver());
        Depot north = new Depot("North");
        north.addVehicle(van);
        north.addVehicle(truck);
        north.addVehicle(scooter);
        north.printFleet();
        System.out.println("North total for 40 km: " + north.totalCost(40));
        truck.recordTrip(120);
        truck.recordTrip(35);
        System.out.println(truck.getRegistration() + " trips: " +
                truck.getTripCount());
        truck.printLogbook();
        Depot south = new Depot("South");
        Vehicle moved = north.removeVehicle("TRK-201");
        south.addVehicle(moved);
        north.printFleet();
        south.printFleet();
        north = null;
        System.out.println(van);
        System.out.println(ana);




    }
}