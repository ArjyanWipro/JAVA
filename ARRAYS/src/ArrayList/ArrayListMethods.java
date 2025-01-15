package ArrayList;

import java.util.ArrayList;
public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>(2);
        list.add("Arjyan");
        list.add("Bibhushan");
        list.add("local");

        System.out.println(list);

        System.out.println(list.get(2));
    }
}
