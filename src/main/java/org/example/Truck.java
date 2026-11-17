package org.example;

public class Truck extends Vehicle{
    private int axles;

    public Truck(String registration, int axles){
        super(registration, 3000.0*axles);
        this.axles = axles;
    }

    public int getAxles() {
        return axles;
    }

    @Override
    public double calculateCost(double distanceKm) {
        return 1.20 * distanceKm + 25 * axles;
    }

    @Override
    public boolean assignDriver(Driver driver) {
        if(driver.getLicence().equalsIgnoreCase("C")){
            super.assignDriver(driver);
            return true;
        }
        else{
            System.out.println(driver.getName() + " has no C licence and cannot drive " + registration);
            return false;
        }
    }

    @Override
    public String toString(){
        return "Truck " + getRegistration() + " | load " + getCurrentLoadKg() + "/" + getMaxLoadKg() + " kg | axles " + axles;
    }
}
