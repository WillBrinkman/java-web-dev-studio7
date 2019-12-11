package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{

    public DVD(String aName, int maximumCapacity, String aType){
        super(aName, maximumCapacity, aType);
    }

    @Override
    public void spinDisc() {
        discRpm = 1600;
        System.out.println("Disc is spinning at " + discRpm + "rpm's.");

    }

    @Override
    public void loadDisc() {
        System.out.println("The " + discType +" has been loaded.");
        spinDisc();

    }
}
