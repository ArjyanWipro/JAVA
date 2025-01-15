package LinkedList;

import java.util.*;

public class LinkedListChallenge {

    record place(String name,int distance){
        @Override
        public final String toString() {
        return ""+name+"("+distance+"km)";
        }
    }
    public static void main(String[] args) {
       LinkedList <place> visitedPlace= new LinkedList<>();
       addPlace(visitedPlace, new place("bhubaneswar",20));
       addPlace(visitedPlace, new place("bhubaneswar",20));

    }

    private static void addPlace(LinkedList<place> list, place place){
        if (list.contains(place)) {
            System.out.println(place+" Already Exist");
            return;
        }
        list.add(place);
    }

}
