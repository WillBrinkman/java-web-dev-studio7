package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String aName, int maximumCapacity, String aType){
        super(aName, maximumCapacity, aType);
    }


    @Override
    public void spinDisc() {
        discRpm = 500;
        System.out.println("Disc is spinning at " + discRpm + " rpm's.");

    }

    @Override
    public void loadDisc() {
        System.out.println("The " + discType +" has been loaded.");
        spinDisc();

    }
}
