package org.example;

public class Driver {
    private String name;
    private String licence;

    public Driver(String name, String licence){
        this.name = name;
        this.licence = licence;
    }

    public String getName() {
        return name;
    }

    public String getLicence() {
        return licence;
    }

    @Override
    public String toString(){
        return name + " (licence " + licence + ")";
    }
}
