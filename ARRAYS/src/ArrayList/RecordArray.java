package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name,String type,int count){
    public GroceryItem(String name){
        this(name, "unknown", 1);
    }

    public GroceryItem(String name,String type){
        this(name,type,1);
    }
}
public class RecordArray {
    public static void main(String[] args) {
        GroceryItem[] groceryArray= new GroceryItem[3];
        groceryArray[0]=new GroceryItem("Milk","Omfed",2);
        groceryArray[1]=new GroceryItem("Soap","Wild Stone");
        groceryArray[2]=new GroceryItem("Hand Wash");

        System.out.println(Arrays.toString(groceryArray));

        System.out.println("-".repeat(50));

        ArrayList objectList= new ArrayList();
        objectList.add(new GroceryItem("Shampoo","Santoor",2));
        objectList.add("Egg");

        System.out.println(objectList);

        ArrayList<GroceryItem> groceryList=new ArrayList<>();
        groceryList.add(new GroceryItem("Shampoo","Santoor",2));

        System.out.println(groceryList);
    }
}
