package InterfaceChallenge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<MappingInterface> mapping= new ArrayList<>();
    mapping.add(new Building("PVR", UsageType.ENTERTAINMENT));
    mapping.add(new Building("White House", UsageType.GOVERNMENT));
    mapping.add(new Building("CDA", UsageType.RESIDENTIAL));
    mapping.add(new Building("Barabati", UsageType.SPORTS));

    for(var m : mapping){
        MappingInterface.mapIt(m);
    }

    }
}
