package org.example;

public class Van extends Vehicle{
    private boolean refrigerated;

    public Van(String registration, boolean refrigerated){
        super(registration, 800.0);
        this.refrigerated = refrigerated;
        //super.registration = registration;
    }

    public Van(String registration){
        super(registration, 800.0);
    }

    public boolean isRefrigerated() {
        return refrigerated;
    }

    @Override
    public double calculateCost(double distanceKm) {
        if(refrigerated) return 0.6 * distanceKm + 15;
        return 0.6 * distanceKm;
    }

    @Override
    public String toString(){
        String print = "Van " + getRegistration() + " | load " + getCurrentLoadKg() + "/" + getMaxLoadKg() + " kg ";
        if (refrigerated) print += "| refrigerated ";
        return print;
    }

}
