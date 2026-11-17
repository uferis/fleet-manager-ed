package org.example;

import java.util.ArrayList;

public class Depot {
    private String name;
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public Depot(String name){
        this.name = name;
    }

    public void addVehicle(Vehicle v){
        vehicles.add(v);
    }

    public Vehicle removeVehicle(String registration){
        for (int i = 0; i < vehicles.size(); i++) { // we need to iterate through a list, for it's not like a set where we can look up values quickly
            Vehicle v = vehicles.get(i);
            if (v.getRegistration().equalsIgnoreCase(registration)){
                vehicles.remove(v);
                return v;
            }
        }
        // if after the iteration no vehicle with the needed registration was found, return null.
        return null;
    }

    public double totalCost(double distanceKm){
        double cost = 0;
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle v = vehicles.get(i);
            cost += v.calculateCost(distanceKm);
        }
        return cost;
    }

    public void printFleet(){
        System.out.println("Depot " + name + " (" + vehicles.size() + " vehicles)");
        for (Vehicle vehicle: vehicles){
            System.out.println("  " + vehicle);
        }
    }
}
