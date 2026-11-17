package org.example;

public class ElectricScooter extends Vehicle{
    private double rangeKm;

    public ElectricScooter(String registration, double rangeKm){
        super(registration, 25.0);
        this.rangeKm = rangeKm;
    }

    public boolean canReach(double km){
        return rangeKm == km;
    }

    @Override
    public double calculateCost(double distanceKm) {
        return 0.15 * distanceKm;
    }

    public String toString(){
        return "E-scooter " + getRegistration() + " | load " + getCurrentLoadKg() + "/" + getMaxLoadKg() + " kg | range " + rangeKm + " km";
    }
}
