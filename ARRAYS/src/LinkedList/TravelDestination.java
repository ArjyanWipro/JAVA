package LinkedList;

import java.util.*;

public class TravelDestination {
    public static void main(String[] args) {
        LinkedList<String> placeName = new LinkedList<>();

        // System.out.println(placeName);
        placeName.addAll(addPlace());
        System.out.println(placeName);

        destinationInDetails(placeName);

    }

    public static LinkedList<String> addPlace() {
        LinkedList<String> addingElement= new LinkedList<>();
        addingElement.add("Bhubaneswar");
        addingElement.add("Chatisgad");
        addingElement.add("Cuttack");
        addingElement.add("Baleswar");
        addingElement.add("Kandhamal");

        return new LinkedList<>(addingElement);
    }

    public static void destinationInDetails(LinkedList<String> placeName) {
        String firstDestination=placeName.getFirst();
        System.out.println("Travel Start from " + firstDestination);

        for(int i=1;i<placeName.size();i++){
            System.out.println("-".repeat(i)+"Destination "+placeName.get(i-1)+ " to "+ placeName.get(i));
        }
        System.out.println("Travel Ends at " + placeName.getLast());
    }
}
