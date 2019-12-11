package org.launchcode.studio7;

import java.util.ArrayList;

public class  Main {

    public static void main(String[] args){

CD myCd = new CD("Blank CD", 737, "CD");
DVD myDvd = new DVD("Blank blue ray DVD", 25000, "Blu Ray DVD");

myDvd.spinDisc();

myCd.spinDisc();

myDvd.loadDisc();
System.out.println(myDvd.writeToDisc(24999));
System.out.println(myDvd.writeToDisc(2));

ArrayList<String> aTrack = new ArrayList();
aTrack.add(0, "beep boop");
myCd.setContents(aTrack);
myCd.loadDisc();
myCd.getContents();




    }
}
