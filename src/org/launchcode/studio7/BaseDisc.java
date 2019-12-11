package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private ArrayList<String> contents;
    protected String discType;
    protected int discRpm;

    public String getDiscType() {
        return discType;
    }

    public int getCapacity() {
        return capacity;
    }


    public int getRemainingCapacity() {
        return remainingCapacity;
    }

    public int getUsedCapacity() {
        return usedCapacity;
    }


    public ArrayList<String> getContents() {
        return contents;
    }

    public void setContents(ArrayList<String> aContents) {
        this.contents = aContents;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }
    private int capacity;
    private int remainingCapacity;
    private int usedCapacity;


    public BaseDisc(String aName, int maximumCapacity, String aType) {
        name = aName;
        capacity = maximumCapacity;
        discType = aType;
        remainingCapacity = spaceRemaining();

    }
    private int spaceRemaining(){
        return capacity - usedCapacity;
    }
    public String writeToDisc(int dataSize) {
        if (dataSize > remainingCapacity){
            return "Cannot write to disc.  Not enough remaining space.";
        }
        usedCapacity += dataSize;
        remainingCapacity -= dataSize;
        return "write to disc successful.";
    }

    public String unloadDisc(){
        discRpm = 0;
        return "Disc has been removed.";
    }



}
