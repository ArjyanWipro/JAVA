package LinkedList;

import java.util.*;
public class List {
   public static void main(String[] args) {
    LinkedList<String> list=new LinkedList<>();
    list.add("Arjyan");
    list.add("bibhushan");
    
    System.out.println(list);

    // LinkedList<String> list2=new LinkedList<>();
    var list2= new LinkedList<String>();
    list2.addAll(addMoreElements(list2));
    list2.addAll(list);

    System.out.println(list2);

    list2.removeAll(removeElements(list2));
    System.out.println(list2);

   }


   public static LinkedList<String> addMoreElements(LinkedList<String> listToAdd){
    listToAdd.add("Rohan");
    listToAdd.add(0,"Sonali");
    listToAdd.add("Ghunshyam");
    listToAdd.add("Satya");
    listToAdd.add("Rajesh");
    listToAdd.add("Subrat");

    return new LinkedList<>(listToAdd);
   }

   public static LinkedList<String> removeElements(LinkedList<String> listToRemove){
    String removedElement=listToRemove.remove(0);
    System.out.println(removedElement + " is removed");

    String removedElement1=listToRemove.removeFirst();
    System.out.println(removedElement1+ " is removed");

    String removedElement2=listToRemove.removeLast();
    System.out.println(removedElement2 +" Is removed");
    listToRemove.remove("Rajesh");

    listToRemove.poll();

    return new LinkedList<>(listToRemove);

   }
}
