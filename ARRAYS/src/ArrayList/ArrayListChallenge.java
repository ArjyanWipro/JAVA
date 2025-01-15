package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Retriving data from user
        System.out.println("Enter 0-to quit,1-to Add item,2-Remove item");
        int input = sc.nextInt();

        // Creating ArrayList
        ArrayList<String> groceryList = new ArrayList<>();
        while (input != 0) {
            if (input == 1) {
                System.out.println("Enter elements you want to add using ','");
                String[] iteams = sc.next().toUpperCase().split(",");
                // groceryList.addAll(List.of(iteams));
                for (String i : iteams) {
                    String trimed = i.trim();
                    if (groceryList.indexOf(trimed) < 0) {
                        groceryList.addAll(List.of(trimed));
                    }
                }
                groceryList.sort(Comparator.naturalOrder());
                System.out.println("Total elements after adding is " + groceryList);
            } else if (input == 2) {
                System.out.println("Enter elements you want to Delete using ','");
                String[] valueToRemove = sc.next().toUpperCase().split(",");
                boolean validation = groceryList.contains(valueToRemove);
                if (validation) {
                    groceryList.remove(valueToRemove);
                } else {
                    System.out.println(valueToRemove + " is not available");
                }

                System.out.println("Total elements after removing is " + groceryList);
            } else {
                System.out.println("Other number raher than 1,2,0 is not permited");
            }
            System.out.println("If you want to add again press 1(Add),2(Delete) or 0(Quit)");
            input = sc.nextInt();
        }
        System.out.println("You have closed the programe");
    }
}
