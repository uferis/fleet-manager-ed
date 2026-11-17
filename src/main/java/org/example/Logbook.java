package org.example;

import java.util.ArrayList;

public class Logbook {
    private ArrayList<String> entries = new ArrayList<>();
    private int tripCount = 0;
    public void addEntry(String entry){
        tripCount++;
        entries.add("Trip " + tripCount + ": " + entry);
    }

    public int getEntryCount(){
        return tripCount;
    }

    public void printAll(){
        for(String entry: entries){
            System.out.println("  " + entry);
        }
    }
}
