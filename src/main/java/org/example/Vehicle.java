package org.example;

public abstract class Vehicle {
    protected String registration;
    protected double maxLoadKg;
    private double currentLoadKg;
    private Driver driver;
    private Logbook logbook;

    public Vehicle (String registration, double maxLoadKg){
        this.registration = registration;
        this.maxLoadKg = maxLoadKg;
        this.currentLoadKg = 0.0;
        this.driver = null;
        this.logbook = new Logbook(); // Composition
    }

    public String getRegistration() {
        return registration;
    }

    public double getMaxLoadKg() {
        return maxLoadKg;
    }

    public double getCurrentLoadKg() {
        return currentLoadKg;
    }



    public boolean loadParcel(double weightKg){
        if (currentLoadKg + weightKg < maxLoadKg){ // validation
            return false;
        }

        currentLoadKg = currentLoadKg + weightKg;
        return true;
    }

    public boolean loadParcel(double weightKg, int count){
        if((currentLoadKg + weightKg*count) > maxLoadKg){ // validation
            return false;
        }

        return loadParcel(weightKg*count);
    }

    public void unload(){
        this.currentLoadKg = 0.0;
    }

    public abstract double calculateCost(double distanceKm);

    public double calculateCost(double distanceKm, int stops){
        return calculateCost(distanceKm) + 2.00*stops;
    }

    public boolean assignDriver(Driver driver){
        this.driver = driver;
        return true;
    }

    public Driver getDriver() {
        return driver;
    }

    public void recordTrip(double distanceKm){
        logbook.addEntry(distanceKm + " km, cost " + calculateCost(distanceKm));
    }

    public int getTripCount(){
        return logbook.getEntryCount();
    }

    public void printLogbook(){
        logbook.printAll();
    }

    @Override
    public String toString(){
        return "";
    }

}
